package com.craneos.java11.part1.chapter5.arrays;

public class VarArgs {

    public static void main(String[] args) {
        testCase1(new String[]{"a","b","c"});
        //testCase1("a","b","c"); // DOES NOT COMPILE
        testCase2(new String[]{"a","b","c"});
        //testCase2("a","b","c"); // DOES NOT COMPILE
        testCase3(new String[]{"a","b","c"});
        testCase3("a","b","c");
    }

    public static void testCase1(String[] args){
        System.out.println("\n--------- VAR ARGS 1 --------");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

    public static void testCase2(String args[]){
        System.out.println("\n--------- VAR ARGS 2 --------");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

    public static void testCase3(String... args){
        System.out.println("\n--------- VAR ARGS 3 --------");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

}
