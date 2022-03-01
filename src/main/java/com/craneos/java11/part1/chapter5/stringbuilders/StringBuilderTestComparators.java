package com.craneos.java11.part1.chapter5.stringbuilders;

public class StringBuilderTestComparators {
    public static void main(String[] args) {

        // Set up some test data.
        StringBuilder sb = new StringBuilder("This is a test");
        StringBuilder sb2 = new StringBuilder("This is a test");

        // == comparator (compares references)
        System.out.println("(sb == sb2) = " + (sb == sb2));

        // .equals operator from java.lang.Object
        System.out.println("(sb.equals(sb2)) = " + (sb.equals(sb2)));

        // .compareTo method defined on StringBuilder Object
        System.out.println("(sb.compareTo(sb2)) = " + (sb.compareTo(sb2)));

        // .equals used to compare String Values of StringBuilder objects
        System.out.println("sb.toString().equals(sb2.toString()) = " +
                sb.toString().equals(sb2.toString()));

        // == used to compare String Values of StringBuilder objects
        System.out.println("sb.toString() == sb2.toString()) = " +
                (sb.toString() == sb2.toString()));

    }
}