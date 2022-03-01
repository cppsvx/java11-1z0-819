package com.craneos.java11.part1.chapter6.parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TypeInference {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    private static void testCase1(){
        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;
    }

    private static void testCase2(){
        Consumer<Integer> consumer = (var x) -> System.out.print(x);
        consume(consumer, 123);
        consume((var x) -> System.out.print(x), 123);
    }

    private static void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

    private static void testCase3(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);list.add(5);list.add(6);
        counts(list);
    }

    public static void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }

}
