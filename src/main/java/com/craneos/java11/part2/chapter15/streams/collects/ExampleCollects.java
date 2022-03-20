package com.craneos.java11.part2.chapter15.streams.collects;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleCollects {

    public static void main(String[] args){
        testBasicCollects();
        testAverageInt();
        testCollection();
    }

    public static void testBasicCollects(){
        System.out.println("\n----------------------------- testBasicCollects ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        String result = animals.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears
    }

    public static void testAverageInt(){
        System.out.println("\n----------------------------- testAverageInt ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Double result = animals.collect(Collectors.averagingInt(String::length));
        System.out.println(result); // 5.333333333333333
    }

    public static void testCollection(){
        System.out.println("\n----------------------------- testCollection ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result = animals
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result); // [tigers]
    }

}
