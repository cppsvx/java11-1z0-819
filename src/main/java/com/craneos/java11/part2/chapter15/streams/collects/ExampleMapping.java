package com.craneos.java11.part2.chapter15.streams.collects;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMapping {

    public static void main(String[] args){
        testPreMapping();
        testMapping();
        //testMapping2();
        //testMappingExam();
    }

    public static void testPreMapping(){
        System.out.println("\n----------------------------- testPreMapping ------------------------");
        var animals = Stream.of("lions", "tigers", "bears", "bee");
        Map<Integer, Long> map = animals.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map); // {5=2, 6=1}
    }

    public static void testMapping(){
        System.out.println("\n----------------------------- testMapping ------------------------");
        var animals = Stream.of("lions", "tigers", "bears", "bee");
        Map<Integer, Optional<Character>> map = animals.collect(
                Collectors.groupingBy(String::length, Collectors.mapping(s -> s.charAt(0), Collectors.minBy((a, b) -> a -b))));
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}
    }

    /**
    public static void testMappingExam(){
        System.out.println("\n----------------------------- testMappingExam ------------------------");
        var animals = Stream.of("lions", "tigers", "bears");
        var map = animals.collect(groupingBy(String::length, mapping(s -> s.charAt(0), minBy((a, b) -> a -b))));
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}
    }*/

}
