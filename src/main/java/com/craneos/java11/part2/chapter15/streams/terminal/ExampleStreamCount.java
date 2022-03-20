package com.craneos.java11.part2.chapter15.streams.terminal;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExampleStreamCount {

    public static void main(String[] args){
        testCount();
        testMinMax();
        testFindAnyFirst();
        testMatch();
        testForeach();
        testReduce();
        testReduceString();
        testReduce2();
        testReduce3();
    }

    public static void testCount() {
        System.out.println("\n----------------------------- testCount ------------------------");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
    }

    public static void testMinMax() {
        System.out.println("\n----------------------------- testMinMax ------------------------");
        Stream<String> animals = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = animals.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape

        // Since the stream is empty, the comparator is never called, and no value is
        // present in the Optional.
        Stream<String> animals2 = Stream.of("monkey", "ape", "bonobo");
        Optional<?> minEmpty2 = animals2.min((s1, s2) -> 0);
        System.out.println(minEmpty2.isPresent()); // false

        // Since the stream is empty, the comparator is never called, and no value is
        // present in the Optional.
        Optional<?> minEmpty3 = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty3.isPresent()); // false
    }

    public static void testFindAnyFirst() {
        System.out.println("\n----------------------------- testFindAnyFirst ------------------------");
        Stream<String> animals1 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> animals2 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        animals1.findAny().ifPresent(System.out::println); // monkey (usually)
        animals2.findFirst().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
    }

    public static void testMatch() {
        System.out.println("\n----------------------------- testMatch ------------------------");
        var list = List.of("monkey", "2", "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false

        Stream<String> infinite = Stream.generate(() -> "chimp");
        System.out.println(infinite.anyMatch(pred)); // true
    }

    public static void testForeach(){
        System.out.println("\n----------------------------- testForeach ------------------------");
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo

        // DOES NOT COMPILE
        //Stream<Integer> s1 = Stream.of(1);
        //for (Integer i : s1) {}
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
