package com.craneos.java11.part1.chapter7.methods;

public class VarArgsExample {

    public static void main(String[] args) {
        testCase1(3, 4, 5, 6);
        testCase2(5, 1,3,5);
    }

    public static void testCase1(int... nums) {}
    public static void testCase2(int start, int... nums) {}

    // DOES NO compile because they have a varargs parameter in a position that
    // IS NOT THE LAST INE
    //public void walk3(int... nums, int start) {} // DOES NOT COMPILE
    //public void walk4(int... start, int... nums) {} // DOES NOTCOMPILE

}
