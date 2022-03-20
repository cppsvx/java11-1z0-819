package com.craneos.java11.part2.chapter15.streams;

import java.util.List;
import java.util.stream.Stream;

public class ExampleStreamCreation {

    public static void main(String[] args){
        testCreation();
        testCreationInfinite();
        testCreationGenerate();
        testCreationIterate();
    }

    public static void testCreation() {
        var list = List.of("a", "b", "c");
        List<String> list2 = List.of("a", "b", "c");
        System.out.println("\n----------------------------- testCreation ------------------------");
        Stream<String> empty = Stream.empty(); // count =0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3
        Stream<String> fromListParallel = List.of("a", "b", "c").parallelStream();

        System.out.println("empty = "+empty);
        System.out.println("empty = "+empty.count());
        System.out.println("singleElement = "+singleElement);
        System.out.println("singleElement = "+singleElement.count());
        System.out.println("fromArray = "+fromArray);
        System.out.println("fromArray = "+fromArray.count());
        System.out.println("fromListParallel = "+fromListParallel.count());
    }

    public static void testCreationInfinite() {
        System.out.println("\n----------------------------- testCreationInfinite ------------------------");
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        Stream<Integer> oddNumberUnder100 = Stream.iterate(1, n -> n < 100, n -> n + 2);

        System.out.println("randoms = "+randoms);
        //System.out.println("randoms = "+randoms.count()); // Infinite loop
        //randoms.forEach(System.out::println); // Infinite loop

        System.out.println("oddNumbers = "+oddNumbers);
        // System.out.println("oddNumbers = "+oddNumbers.count()); // Infinite loop
        //oddNumbers.forEach(System.out::println);  // Infinite loop

        System.out.println("oddNumberUnder100 = "+oddNumberUnder100);
        oddNumberUnder100.forEach(System.out::println);
    }

    public static void testCreationGenerate() {
        System.out.println("\n----------------------------- testCreationGenerate ------------------------");
        Stream<Double> randoms = Stream.generate(Math::random);
        var other = Stream.generate(() -> "growl!");

        System.out.println("randoms = "+randoms);
        System.out.println("other = "+other);

        //randoms.forEach(System.out::println); // Infinite loop
        //other.forEach(System.out::println); // Infinite loop
    }

    public static void testCreationIterate() {
        System.out.println("\n----------------------------- testCreationIterate ------------------------");
        var oddNumberUnder100 = Stream.iterate(1, n -> n < 100, n -> n + 2);

        System.out.println("oddNumberUnder100 = "+oddNumberUnder100);
        oddNumberUnder100.forEach(System.out::println);
    }
}
