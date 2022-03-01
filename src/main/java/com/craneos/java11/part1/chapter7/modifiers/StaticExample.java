package com.craneos.java11.part1.chapter7.modifiers;

//import static java.util.Arrays; // DOES NOT COMPILE
//static import java.util.Arrays.*;  // DOES NOT COMPILE
import java.util.Arrays;
import static java.util.Arrays.asList;

public class StaticExample {

    private final static String MESSAGE = "Hello World!";
    //private final static String MESSAGE1; // DOES NOT COMPILE. NOT INITIALIZED
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1(){
        asList("one");
        Arrays.asList("one");
        System.out.println(MESSAGE);
        System.out.println(NUM_SECONDS_PER_HOUR);
    }

}
