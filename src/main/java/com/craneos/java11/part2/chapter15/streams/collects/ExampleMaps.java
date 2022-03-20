package com.craneos.java11.part2.chapter15.streams.collects;

import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMaps {

    public static void main(String[] args){
        testMap1();
        testMap2();
        testMap2Solved();
    }

    public static void testMap1(){
        System.out.println("\n----------------------------- testMap1 ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = animals.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}
    }

    public static void testMap2(){
        System.out.println("\n----------------------------- testMap2 ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        //Map<Integer, String> map = animals.collect(Collectors.toMap(String::length, k -> k)); // BAD
        //System.out.println(map);
    }

    public static void testMap2Solved(){
        System.out.println("\n----------------------------- testMap2Solved ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = animals.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        //Map<Integer, String> map = animals.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s2));
        System.out.println(map); // {5=lions,bears,6=tigers}
        System.out.println(map.getClass()); // class java.util.HashMap
    }

}
