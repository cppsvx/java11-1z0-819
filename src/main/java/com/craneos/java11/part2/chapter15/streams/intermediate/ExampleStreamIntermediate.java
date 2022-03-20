package com.craneos.java11.part2.chapter15.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamIntermediate {

    public static void main(String[] args){
        testFilter();
        testDistinct();
        testLimit();
        testSkip();
        testMap();
        testFlatMap();
        testSorted();
        testPeek();
        testPeek2();
    }

    public static void testFilter(){
        System.out.println("\n----------------------------- testFilter ------------------------");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print); // monkey
    }

    public static void testDistinct(){
        System.out.println("\n----------------------------- testDistinct ------------------------");
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print); // duckgoose
    }

    public static void testLimit(){
        System.out.println("\n----------------------------- testLimit ------------------------");
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.limit(5).forEach(n->System.out.println(n));
    }

    public static void testSkip(){
        System.out.println("\n----------------------------- testLimit ------------------------");
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(5).limit(5).forEach(System.out::println); // 67
    }

    public static void testMap(){
        System.out.println("\n----------------------------- testMap ------------------------");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::println); // 676
    }

    public static void testFlatMap(){
        System.out.println("\n----------------------------- testFlatMap ------------------------");
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream()).forEach(System.out::println);
    }

    public static void testSorted(){
        System.out.println("\n----------------------------- testSorted ------------------------");
        Stream<String> s1 = Stream.of("brown-", "bear-");
        s1.sorted().forEach(System.out::println); // bear-brown-

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::println); // grizzly-brown bear-
        //s2.sorted(Comparator::reverseOrder).forEach(System.out::println); // DOES NOT COMPILE
    }

    public static void testPeek(){
        System.out.println("\n----------------------------- testPeek ------------------------");
        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }

    public static void testPeek2(){
        System.out.println("\n----------------------------- testPeek2 ------------------------");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> newList1 = list.stream().collect(Collectors.toList());
        System.out.println("- 1 --> "+newList1);
        List<Integer> newList2 = list.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("- 2 --> "+newList2);
        //List<Integer> newList3 = list.stream().peek(e->(e+5)).collect(Collectors.toList());// ERROR. CANNOT CONVERTED TO VOID
        //System.out.println("- 3 --> "+newList3);
    }
}
