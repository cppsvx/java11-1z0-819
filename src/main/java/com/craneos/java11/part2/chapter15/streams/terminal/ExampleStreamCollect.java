package com.craneos.java11.part2.chapter15.streams.terminal;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamCollect {

    public static void main(String[] args){
        testCollect1();
        testCollect2();
        testCollect3();
        testCollect4();
    }

    public static void testCollect1(){
        System.out.println("\n----------------------------- testCollect1 ------------------------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word); // wolf
    }

    public static void testCollect2(){
        System.out.println("\n----------------------------- testCollect2 ------------------------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]
    }

    public static void testCollect3(){
        System.out.println("\n----------------------------- testCollect3 ------------------------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]
    }

    public static void testCollect4(){
        System.out.println("\n----------------------------- testCollect4 ------------------------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]
    }

}
