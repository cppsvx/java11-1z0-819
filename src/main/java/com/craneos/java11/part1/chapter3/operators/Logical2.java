package com.craneos.java11.part1.chapter3.operators;

public class Logical2 {

    static boolean eyesClosed = true;
    static boolean breathingSlowly = true;
    static boolean resting = eyesClosed | breathingSlowly;
    static boolean asleep = eyesClosed & breathingSlowly;
    static boolean awake = eyesClosed ^ breathingSlowly;

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1(){
        System.out.println(resting); // true
        System.out.println(asleep); // true
        System.out.println(awake); // false
    }

}
