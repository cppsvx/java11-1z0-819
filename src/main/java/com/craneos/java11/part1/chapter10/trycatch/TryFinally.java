package com.craneos.java11.part1.chapter10.trycatch;

public class TryFinally {

    public static void main(String[] args) {
        int result = testCase1();
        System.out.println(result);
        int result2 = testCase2();
        System.out.println(result2);
    }

    private static int testCase1(){
        try {
            // Optionally throw an exception here
            System.out.print("1");
            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }
    }

    /*
    There is one exception to “the finally block always be executed”
    rule: Java defines a method that you call as System.exit(). It takes
    an integer parameter that represents the error code that gets returned.
     */
    private static int testCase2(){
        try {
            System.exit(0);
        } finally {
            System.out.print("Never going to get here"); // Not printed
        }
        return -5;
    }
}
