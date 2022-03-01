package com.craneos.java11.part1.chapter3.operators;

public class Relational {

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1(){
        int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
        System.out.println(gibbonNumFeet < wolfNumFeet); // true
        System.out.println(gibbonNumFeet <= wolfNumFeet); // true
        System.out.println(gibbonNumFeet >= ostrichNumFeet); // true
        System.out.println(gibbonNumFeet > ostrichNumFeet); // false
    }

}
