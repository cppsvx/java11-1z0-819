package com.craneos.java11.part1.chapter5.stringpool;

public class StringPool {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    private static void testCase1(){
        System.out.println("----------------- POOL CASE 1 ----------------");
        String text1 = "Hello World";
        String text2 = "Hello World";
        String text3 = "Hello" + " World";
        String text4 = new String("Hello") + new String(" World");
        String text5 = ("Hello") + (" World");
        System.out.println(String.format("text1=%s     text2=%s     text3=%s",text1, text2, text3));
        System.out.println("text1 == text2 --> "+(text1==text2));
        System.out.println("text1.equals(text2)--> "+(text1.equals(text2)));
        System.out.println("text1 == text3 --> "+(text1==text3));
        System.out.println("text1.equals(text3)--> "+(text1.equals(text3)));
        System.out.println("text1 == text4 --> "+(text1==text4));
        System.out.println("text1.equals(text4)--> "+(text1.equals(text4)));
        System.out.println("text1 == text5 --> "+(text1==text5));
        System.out.println("text1.equals(text5)--> "+(text1.equals(text5)));
    }

    private static void testCase2(){
        System.out.println("----------------- POOL CASE 2 ----------------");
        String text1 = "Hi Bro";
        String text2 = " Hi Bro".strip();
        System.out.println(String.format("text1=%s     text2=%s",text1, text2));
        System.out.println("text1 == text2 --> "+(text1==text2));
        System.out.println("text1.equals(text2)--> "+(text1.equals(text2)));
    }

    private static void testCase3(){
        System.out.println("----------------- POOL CASE 3 ----------------");
        String text1 = "Hello World";
        String text2 = new String("Hello World");
        System.out.println(String.format("text1=%s     text2=%s",text1, text2));
        System.out.println("text1 == text2 --> "+(text1==text2));
        System.out.println("text1.equals(text2)--> "+(text1.equals(text2)));
    }
}
