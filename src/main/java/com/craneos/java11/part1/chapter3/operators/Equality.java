package com.craneos.java11.part1.chapter3.operators;

public class Equality {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    public static void testCase1(){
        System.out.println("--------- EQUALITY 1 --------");
        String x = "Hello World";
        String y = "Hello World";
        System.out.println("  ==  : "+(x==y));
        System.out.println("equals: "+x.equals(y));
    }

    public static void testCase2(){
        System.out.println("--------- EQUALITY 2 --------");
        String x = "Hello World";
        String y = "Hello World".trim();
        System.out.println("  ==  : "+(x==y));

        String xx = "Hello World";
        String yy = " Hello World".trim();
        System.out.println("  ==  : "+(xx==yy));
        System.out.println("equals: "+(xx.equals(yy)));
    }

    public static void testCase3(){
        System.out.println("--------- EQUALITY 3 --------");
        String x = new String("Hello World");
        String y = "Hello World";
        System.out.println("  ==  : "+(x==y));
    }

}
