package com.craneos.java11.part1.chapter2.var;

import java.util.ArrayList;

public class Var2 {

    public static void main(String[] args) {
        testcase1();
        testcase2();
        testcase3();
    }

    private static void testcase1() {
        var example = 4;
        //example = null; // DOES NOT COMPILE
        System.out.println("example case 1="+example);
    }

    private static void testcase2() {
        var example = (String)null;
        System.out.println("example case 2="+example);
        if (example == null){
            System.out.println("example case 2 is null");
        } else if (example.equals("null")){
            System.out.println("example case 2 is equals to null");
        }
    }

    private static void testcase3() {
        var list = new ArrayList<>();
        list.add("a");
        //for (String s: list) { } // DOES NOT COMPILE, requires an object
    }
}
