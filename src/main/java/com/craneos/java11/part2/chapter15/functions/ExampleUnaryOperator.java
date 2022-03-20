package com.craneos.java11.part2.chapter15.functions;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperator {

    public static void main(String[] args){
        testUnaryOperator1();
    }

    public static void testUnaryOperator1() {
        System.out.println("\n----------------------------- testUnaryOperator1 ------------------------");
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5

        System.out.println("\n----------------------------- testUnaryOperator1 ------------------------");
        System.out.println("\nA UnaryOperator transforms its value into one of the same type. For example, " +
                "incrementing by one is a unary operation. In fact, UnaryOperator extends Function");
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp")); // CHIRP
        System.out.println(u2.apply("chirp")); // CHIRP
    }

}
