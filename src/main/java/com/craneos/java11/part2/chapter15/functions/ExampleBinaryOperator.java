package com.craneos.java11.part2.chapter15.functions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

    public static void main(String[] args){
        testBinaryOperator1();
    }

    public static void testBinaryOperator1() {
        System.out.println("\n----------------------------- testBinaryOperator1 ------------------------");
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick

        System.out.println("\n----------------------------- testBinaryOperator1 ------------------------");
        BinaryOperator<String> c1 = String::concat;
        BinaryOperator<String> c2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(c1.apply("baby ", "chick")); // baby chick
        System.out.println(c2.apply("baby ", "chick")); // baby chick
    }

}
