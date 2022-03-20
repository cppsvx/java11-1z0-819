package com.craneos.java11.part2.chapter15.functions;

import java.util.function.Function;

public class ExampleFunctions {

    public static void main(String[] args){
        testFunctions1();
    }

    public static void testFunctions1() {
        System.out.println("\n----------------------------- testFunctions1 ------------------------");
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5
    }

}