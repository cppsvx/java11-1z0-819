package com.craneos.java11.part2.chapter15.predicates;

import java.util.function.Predicate;

public class ExamplePredicates {

    public static void main(String[] args){
        testPredicates1();
    }

    public static void testPredicates1() {
        System.out.println("\n----------------------------- testPredicates1 ------------------------");
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("")); // true
        System.out.println(p2.test("")); // true
    }

}
