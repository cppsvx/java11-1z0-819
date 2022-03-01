package com.craneos.java11.part1.chapter3.operators;

public class CompoundAsignment {

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1(){
        long x = 10;
        int y = 5;
        //y = y * x; //DOES NOT COMPILE
        y *= x; // compound assignment is casting
    }

}
