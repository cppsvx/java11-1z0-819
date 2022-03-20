package com.craneos.java11.part2.chapter15.streams.collects;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleGrouping {

    public static void main(String[] args){
        testGrouping();
        testGroupingSet();
        testGroupingTree();
        testGroupingTreeList();
        testGrouping5();
    }

    public static void testGrouping(){
        System.out.println("\n----------------------------- testGrouping ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = animals.collect(Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }

    public static void testGroupingSet(){
        System.out.println("\n----------------------------- testGroupingSet ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map = animals.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }

    public static void testGroupingTree(){
        System.out.println("\n----------------------------- testGroupingTree ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map = animals.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }

    public static void testGroupingTreeList(){
        System.out.println("\n----------------------------- testGroupingTreeList ------------------------");
        var ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map);
    }

    public static void testGrouping5() {
        System.out.println("\n----------------------------- testGrouping5 ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = animals.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map); // {5=2, 6=1}
    }

}
