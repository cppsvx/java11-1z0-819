package com.craneos.java11.part2.chapter15.consumers;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class ExampleBiconsumer {

    public static void main(String[] args){
        testBiconsumers1();
        testBiconsumers2();
    }

    public static void testBiconsumers1() {
        System.out.println("\n----------------------------- testBiconsumers1 ------------------------");
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);
    }

    public static void testBiconsumers2() {
        System.out.println("\n----------------------------- testBiconsumers2 ------------------------");
        var map = new HashMap<String, String>();
        BiConsumer<String, String> b1 = map::put;
        BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", "Cluck");
        b2.accept("chick", "Tweep");

        System.out.println(map);
    }

}