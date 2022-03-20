package com.craneos.java11.part2.chapter15.predicates;

import java.util.function.BiPredicate;

public class ExampleBipredicates {

    public static void main(String[] args){
        testBipredicates1();
    }

    public static void testBipredicates1() {
        System.out.println("\n----------------------------- testBipredicates1 ------------------------");
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick")); // true
        System.out.println(b2.test("chicken", "chick")); // true
    }

}
