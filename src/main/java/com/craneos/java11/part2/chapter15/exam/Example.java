package com.craneos.java11.part2.chapter15.exam;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args){
        testQuestion1();
        testQuestion2();
        testQuestion3();
        testQuestion4();
    }

    public static void testQuestion1(){
        System.out.println("\n----------------------------- testQuestion1.1 ------------------------");
        var stream1 = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream1.limit(2).map(x -> x + "2"));

        System.out.println("\n----------------------------- testQuestion1.2 ------------------------");
        var stream2 = Stream.iterate("", (s) -> s + "1");
        stream2.limit(2).map(x -> x + "2").forEach(x->System.out.println(x));

        System.out.println("\n----------------------------- testQuestion1.3 ------------------------");
        var stream3 = Stream.iterate("", (s) -> s + "1");
        stream3.limit(2).map(x -> x + "2").forEach(System.out::println);
    }

    public static void testQuestion2(){
        System.out.println("\n----------------------------- testQuestion2.1 ------------------------");
        Predicate<String> predicate21 = s -> s.startsWith("g");
        var stream11 = Stream.generate(() -> "growl!");
        var b11 = stream11.anyMatch(predicate21);
        System.out.println(b11);

        System.out.println("\n----------------------------- testQuestion2.2 ------------------------");
        /*Predicate<String> predicate22 = s -> s.startsWith("g");
        var stream21 = Stream.generate(() -> "growl!");
        var b21 = stream21.allMatch(predicate22);
        System.out.println(b21);*/
    }

    public static void testQuestion3(){
        System.out.println("\n----------------------------- testQuestion3.1 ------------------------");
        Predicate<String> predicate31 = s -> s.length()>3;
        var stream31 = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
        var b31 = stream31.anyMatch(predicate31);
        System.out.println(b31);

        System.out.println("\n----------------------------- testQuestion3.2 ------------------------");
        Predicate<String> predicate32 = s -> s.length()>3;
        var stream32 = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
        var b32 = stream32.noneMatch(predicate32);
        System.out.println(b32);

        System.out.println("\n----------------------------- testQuestion3.3 ------------------------");
        //Predicate<String> predicate33 = s -> s.length()>3;
        var stream33 = Stream.iterate("-1", s -> !s.isEmpty(), (s) -> s + s);
        stream33.limit(5).forEach(System.out::println);

        System.out.println("\n----------------------------- testQuestion3.4 ------------------------");
        Predicate<String> predicate34 = s -> s.length()>3;
        var stream34 = Stream.iterate("-", s -> s.isEmpty(), (s) -> s + s);
        var b34 = stream34.noneMatch(predicate34);
        System.out.println(b34);
    }

    public static void testQuestion4(){
        System.out.println("\n----------------------------- testQuestion4 ------------------------");
        /* A) boxed missing
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));*/

        /* B) Bad return type in lambda expression: long cannot be converted to int
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
         */

        double result1 = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println("result1 = "+result1);

        /* C) boxed missing
        double result2 = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));*/

        /* E) Bad return type in lambda expression: long cannot be converted to int
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
         */

        double result2 = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println("result2 = "+result2);

        Map<Integer, Set<Integer>> map = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()));
        System.out.println("---- test keys:");
        map.keySet().stream().forEach(m -> System.out.println(m));
        System.out.println("---- test values:");
        map.values().stream().forEach(m -> System.out.println(m));
    }

}