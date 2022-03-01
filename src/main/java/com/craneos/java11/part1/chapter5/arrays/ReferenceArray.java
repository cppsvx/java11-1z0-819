package com.craneos.java11.part1.chapter5.arrays;

public class ReferenceArray {

    public static void main(String args[]) {
        testCase1();
        testCase2();
    }

    private static void testCase1(){
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); //[Ljava.lang.String;@160bc7c0
        System.out.println("bugs[0]="+bugs[0]);
        System.out.println("bugs[1]="+bugs[1]);
        System.out.println("bugs[2]="+bugs[2]);
        System.out.println("alias[0]="+alias[0]);
        System.out.println("alias[1]="+alias[1]);
        System.out.println("alias[2]="+alias[2]);
    }

    private static void testCase2(){
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        // DOES NOT COMPILE because a String[] only allows String objects and StringBuilder is not a String.
        objects[0] = new StringBuilder(); // careful! --> ArrayStoreException.
    }
}
