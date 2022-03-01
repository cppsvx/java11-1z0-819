package com.craneos.java11.part1.chapter5.stringbuilders;

public class StringBuilderCreation {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    private static void testCase1(){
        // creates empty builder
        // An empty StringBuilder always has initial capacity of 16
        StringBuilder sb = new StringBuilder();
        // adds 5 character string at beginning
        sb.append("Hello");
        System.out.println("--------------------------------------");
        System.out.println("sb.length =" + sb);
        System.out.println("sb.length =" + sb.length());
        System.out.println("sb.capacity = " + sb.capacity());
    }

    private static void testCase2(){
        System.out.println("--------------------------------------");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb2.length = " + sb2.length());

        // Capacity is the initial capacity (16) + "Hello".length()
        System.out.println("sb2.capacity = " + sb2.capacity());
    }

    private static void testCase3(){
        System.out.println("--------------------------------------");
        StringBuilder sb3 = new StringBuilder();
        // Add 26 character string at beginning, which exceeds the
        // initial capacity of 16
        sb3.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb3.length = " + sb3.length());
        System.out.println("sb3.capacity = " + sb3.capacity());
    }

    private static void testCase4(){
        // You can set initial capacity manually
        StringBuilder sb4 = new StringBuilder(26);
        // Add 26 character string at beginning
        sb4.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb4.length = " + sb4.length());
        System.out.println("sb4.capacity = " + sb4.capacity());
    }

}