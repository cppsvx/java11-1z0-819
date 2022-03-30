package com.craneos.java11.part2.chapter18.parallel;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleCollect {

    public static void main(String[] args) {
        testBasicCollect();
        testReductionCollect();
        testGrouping();
    }

    private static void testBasicCollect(){
        System.out.println("\n----------------------------- testBasicCollect ------------------------");
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set); // [f, l, o, w]
    }

    private static void testReductionCollect(){
        System.out.println("\n----------------------------- testReductionCollect ------------------------");
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears", "aa", "aa").parallel();
        ConcurrentMap<Integer, String> map =
                ohMy.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); //java.util.concurrent.ConcurrentHashMap
    }

    private static void testGrouping(){
        System.out.println("\n----------------------------- testGrouping ------------------------");
        var ohMy = Stream.of("lions","tigers","bears").parallel();
        ConcurrentMap<Integer, List<String>> map = ohMy.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }

}
