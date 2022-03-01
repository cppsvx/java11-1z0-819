package com.craneos.java11.part1.chapter6.functional.predicates;

import java.util.function.Predicate;

public class SimplePredicate {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1(){
        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;
    }

}
