package com.craneos.java11.part2.chapter15.streams.collects;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamplePartitioning {

    public static void main(String[] args){
        testPartitioning1();
        testPartitioning2();
        testPartitioning3();
        testGrouping();
    }

    public static void testPartitioning1(){
        System.out.println("\n----------------------------- testPartitioning1 ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = animals.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); // {false=[tigers], true=[lions,bears]}
    }

    public static void testPartitioning2(){
        System.out.println("\n----------------------------- testPartitioning2 ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = animals.collect(Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map); // {false=[], true=[lions, tigers,bears]}
    }

    public static void testPartitioning3(){
        System.out.println("\n----------------------------- testPartitioning3 ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map = animals.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(map); // {false=[], true=[lions, tigers, bears]}
    }

    public static void testGrouping(){
        System.out.println("\n----------------------------- testPartitioning4 ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = animals.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map); // {5=2, 6=1}
    }
}
