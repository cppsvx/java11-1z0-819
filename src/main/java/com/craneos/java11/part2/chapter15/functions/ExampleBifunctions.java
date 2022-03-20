package com.craneos.java11.part2.chapter15.functions;

import java.util.function.BiFunction;

public class ExampleBifunctions {

    public static void main(String[] args){
        testBifunctions1();
    }

    public static void testBifunctions1() {
        System.out.println("\n----------------------------- testBifunctions1 ------------------------");
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }

}