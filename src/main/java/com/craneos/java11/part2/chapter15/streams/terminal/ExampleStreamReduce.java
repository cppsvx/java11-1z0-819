package com.craneos.java11.part2.chapter15.streams.terminal;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ExampleStreamReduce {

    public static void main(String[] args){
        testReduce();
        testReduceString();
        testReduce2();
        testReduce3();
    }

    /**
    The reduce() method combines a stream into a single object
     */
    public static void testReduce(){
        System.out.println("\n----------------------------- testReduce ------------------------");
        // Normal way
        var array = new String[] { "w", "o", "l", "f" };
        var result = "";
        for (var s: array) result = result + s;
        System.out.println(result); // wolf

        // Stream way
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", (s, c) -> s + c);
        System.out.println(word1); // wolf

        // Stream way
        Stream<String> stream2 = Stream.of("a", "b", "c", "d");
        String word2 = stream2.reduce("", (s, c) -> s + c + "1");
        System.out.println(word2); // wolf
    }

    public static void testReduceString(){
        System.out.println("\n----------------------------- testReduceString ------------------------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", String::concat);
        System.out.println(word); // wolf
    }

    public static void testReduce2(){
        System.out.println("\n----------------------------- testReduce2 ------------------------");
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, (a, b) -> a*b)); // 90

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90
    }

    public static void testReduce3(){
        System.out.println("\n----------------------------- testReduce3 ------------------------");
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        empty.reduce(op).ifPresent(System.out::println); // no output

        Stream<Integer> oneElement = Stream.of(3);
        oneElement.reduce(op).ifPresent(System.out::println); // 3

        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        threeElements.reduce(op).ifPresent(System.out::println); // 90
    }
}
