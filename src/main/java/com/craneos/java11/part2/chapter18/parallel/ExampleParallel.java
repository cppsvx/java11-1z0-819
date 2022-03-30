package com.craneos.java11.part2.chapter18.parallel;

import java.util.List;
import java.util.stream.Stream;

public class ExampleParallel {

    public static void main(String[] args) {
        testBasicParallel();
        testStream();
        testParallelStream();
        testParallelStreamOrdered();
    }

    // applying a terminal operation to s2 also makes s1 unavailable for further use.
    private static void testBasicParallel(){
        System.out.println("\n----------------------------- testBasicParallel ------------------------");
        Stream<Integer> s1 = List.of(1,2).stream();
        Stream<Integer> s2 = s1.parallel();
        Stream<Integer> s3 = List.of(1,2).parallelStream();
    }

    private static void testStream(){
        System.out.println("\n----------------------------- testStream ------------------------");
        long start = System.currentTimeMillis();
        List.of(1,2,3,4,5)
                .stream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: "+timeTaken+" seconds");
    }

    private static void testParallelStream(){
        System.out.println("\n----------------------------- testParallelStream ------------------------");
        long start = System.currentTimeMillis();
        List.of(1,2,3,4,5)
                .parallelStream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: "+timeTaken+" seconds");
    }

    private static void testParallelStreamOrdered(){
        System.out.println("\n----------------------------- testParallelStreamOrdered ------------------------");
        long start = System.currentTimeMillis();
        List.of(5,2,1,4,3)
                .parallelStream()
                .map(w -> doWork(w))
                .forEachOrdered(s -> System.out.print(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: "+timeTaken+" seconds");
    }

    private static int doWork(int input) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        return input;
    }

}
