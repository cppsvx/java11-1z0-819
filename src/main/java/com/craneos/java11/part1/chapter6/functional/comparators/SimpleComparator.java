package com.craneos.java11.part1.chapter6.functional.comparators;

import java.util.Comparator;

public class SimpleComparator {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    private static void testCase4(){
        int value = 2343;
        Comparator<Integer> comparator1 = (a, b) -> { int c = 0; return 5;}; // SEMICOLONS ARE IMPORTANT!!!
        //Comparator<Integer> comparator2 = (a, b) -> { int value = 0; return 5;}; //DOES NOT COMPILE. value EXISTS.
        System.out.println("----------- USING Comparator with BLOCK --------------");
        System.out.println("strings.compare(\"33\",\"62\") -->"+comparator1.compare(33,62));
    }

    private static void testCase1(){

        Comparator<String> strings = (s1, s2) -> s1.compareTo(s2);
        System.out.println("----------- USING Comparator = (s1, s2) -> s1.compareTo(s2) --------------");
        System.out.println("strings.compare(\"a\",\"a\") -->"+strings.compare("a","a"));
        System.out.println("strings.compare(\"a\",\"b\") -->"+strings.compare("a","b"));
        System.out.println("strings.compare(\"b\",\"a\") -->"+strings.compare("b","a"));
        System.out.println("strings.compare(\"b\",\"b\") -->"+strings.compare("b","b"));
        System.out.println("strings.compare(\"hola\",\"adios\") -->"+strings.compare("hola","adios"));
        System.out.println("strings.compare(\"hola\",\"adios\") -->"+strings.compare("hola","adios"));
        System.out.println("strings.compare(\"adios\",\"hola\") -->"+strings.compare("adios","hola"));
        System.out.println("strings.compare(\"hola\",\"hola\") -->"+strings.compare("hola","hola"));
        System.out.println("strings.compare(\"3\",\"5\") -->"+strings.compare("3","5"));
        System.out.println("strings.compare(\"5\",\"3\") -->"+strings.compare("5","3"));
    }

    private static void testCase2(){
        Comparator<String> strings = (s1, s2) -> s2.compareTo(s1);
        System.out.println("----------- USING Comparator = (s1, s2) -> s2.compareTo(s1) --------------");
        System.out.println("strings.compare(\"a\",\"a\") -->"+strings.compare("a","a"));
        System.out.println("strings.compare(\"a\",\"b\") -->"+strings.compare("a","b"));
        System.out.println("strings.compare(\"b\",\"a\") -->"+strings.compare("b","a"));
        System.out.println("strings.compare(\"b\",\"b\") -->"+strings.compare("b","b"));
        System.out.println("strings.compare(\"hola\",\"adios\") -->"+strings.compare("hola","adios"));
        System.out.println("strings.compare(\"hola\",\"adios\") -->"+strings.compare("hola","adios"));
        System.out.println("strings.compare(\"adios\",\"hola\") -->"+strings.compare("adios","hola"));
        System.out.println("strings.compare(\"hola\",\"hola\") -->"+strings.compare("hola","hola"));
        System.out.println("strings.compare(\"3\",\"5\") -->"+strings.compare("3","5"));
        System.out.println("strings.compare(\"5\",\"3\") -->"+strings.compare("5","3"));
    }

    private static void testCase3(){
        Comparator<String> moreStrings = (s1, s2) -> -s1.compareTo(s2);
        System.out.println("----------- USING Comparator = (s1, s2) -> -s1.compareTo(s2) --------------");
        System.out.println("strings.compare(\"a\",\"a\") -->"+moreStrings.compare("a","a"));
        System.out.println("strings.compare(\"a\",\"b\") -->"+moreStrings.compare("a","b"));
        System.out.println("strings.compare(\"b\",\"a\") -->"+moreStrings.compare("b","a"));
        System.out.println("strings.compare(\"b\",\"b\") -->"+moreStrings.compare("b","b"));
        System.out.println("strings.compare(\"hola\",\"adios\") -->"+moreStrings.compare("hola","adios"));
        System.out.println("strings.compare(\"hola\",\"adios\") -->"+moreStrings.compare("hola","adios"));
        System.out.println("strings.compare(\"adios\",\"hola\") -->"+moreStrings.compare("adios","hola"));
        System.out.println("strings.compare(\"hola\",\"hola\") -->"+moreStrings.compare("hola","hola"));
        System.out.println("strings.compare(\"3\",\"5\") -->"+moreStrings.compare("3","5"));
        System.out.println("strings.compare(\"5\",\"3\") -->"+moreStrings.compare("5","3"));
    }
}