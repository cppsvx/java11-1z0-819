package com.craneos.java11.part1.chapter6.lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Lambda {

    private static String color;
    private static String colorfinal;

    public static void main(String[] args) {
        testCaseForeachWithMap();
        testCaseForeach();
        testCaseSort();
        testCaseRemoveIf();
        testCase1("Rick");
        testCase2("Jane");
    }

    private static void testCaseForeachWithMap() {
        System.out.println("----------- LAMBDA FOREACH MAP --------------");
        Map<String, Integer> bunnies = new HashMap<>();
        bunnies.put("long ear", 3);
        bunnies.put("floppy", 8);
        bunnies.put("hoppy", 1);
        bunnies.keySet().forEach(b -> System.out.println(b));
        bunnies.values().forEach(b -> System.out.println(b));
        bunnies.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static void testCaseForeach() {
        System.out.println("----------- LAMBDA FOREACH --------------");
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.forEach(b -> System.out.println(b));
        System.out.println(bunnies); // [floppy, hoppy, long ear]
    }

    private static void testCaseSort() {
        System.out.println("----------- LAMBDA SORT --------------");
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        // bunnies.sort(String::compareTo); // SAME AS BEFORE
        System.out.println(bunnies); // [floppy, hoppy, long ear]
    }

    private static void testCaseRemoveIf() {
        System.out.println("----------- LAMBDA REMOVEIF --------------");
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies); // [hoppy]
    }

    private static void testCase1(String name) {
        System.out.println("----------- LAMBDA 1 --------------");
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says " + volume + " that she is " + color + ". Not forget "+s);
        consumer.accept("hello!!!");
    }

    private static void testCase2(final String name) {
        System.out.println("----------- LAMBDA 2 --------------");
        final String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says " + volume + " that she is " + colorfinal + ". Not forget "+s);
        consumer.accept("hello!!!");
    }

}
