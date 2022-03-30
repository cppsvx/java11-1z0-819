package com.craneos.java11.part2.chapter18.parallel;

import java.util.List;
import java.util.stream.Stream;

public class ExampleReduce {

    public static void main(String[] args) {
        testBasicReduce();
        testProblematicReduce();
    }

    // applying a terminal operation to s2 also makes s1 unavailable for further use.
    private static void testBasicReduce(){
        System.out.println("\n----------------------------- testBasicReduce ------------------------");
        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1,c) -> "444" + c,
                        (s2,s3) -> s2+s3)); // wolf
    }

    private static void testProblematicReduce(){
        System.out.println("\n----------------------------- testProblematicReduce ------------------------");
        System.out.println(List.of(1,2,3,4,5,6)
                .parallelStream()
                .reduce(0, (a,b) -> (a - b))); // PROBLEMATIC ACCUMULATOR

        System.out.println(List.of("w","o","l","f")
                .parallelStream()
                .reduce("X", String::concat)); // XwXoXlXf
    }

}
