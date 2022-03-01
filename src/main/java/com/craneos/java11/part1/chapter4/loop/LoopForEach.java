package com.craneos.java11.part1.chapter4.loop;

public class LoopForEach {

    public static void main(String[] args) {
        System.out.println("For OCA exam, the only members of the Collections framework that you need to be aware of are:");
        System.out.println("- List");
        System.out.println("- ArrayList");
        System.out.println("");
        testCase1();
    }

    public static void testCase1(){
        final String[] names = new String[3];
        names[0] = "me";
        names[1] = "you";
        names[2] = "she/he";
        for(String name:names){
            System.out.println(name);
        }
    }
}
