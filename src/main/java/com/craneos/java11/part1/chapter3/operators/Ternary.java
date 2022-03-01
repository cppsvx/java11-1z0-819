package com.craneos.java11.part1.chapter3.operators;

public class Ternary {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    public static void testCase1(){
        System.out.println();
        int y = 1;
        int z = 1;
        final int result = y<10?y++:z++;
        System.out.println(String.format("-test case 1 --> y:%d  z:%d  result:%d", y, z, result));
    }

    public static void testCase2(){
        int y = 1;
        int z = 1;
        final int result = y<10?++y:++z;
        System.out.println(String.format("-test case 2 --> y:%d  z:%d  result:%d", y, z, result));
    }

    public static void testCase3(){
        int y = 2;
        int z = 6;
        final int result = y<10?y:z;
        System.out.println(String.format("-test case 3 --> y:%d  z:%d  result:%d", y, z, result));
    }

    public static void testCase4(){
        int y = 2;
        int z = 6;
        //String value = y<1?"OUTPUT":false; //DOES NOT COMPILE
    }
}
