package com.craneos.java11.part1.chapter3.operators;

public class Logical {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    public static void testCase1(){
        String text = "hello!";
        // throws an exception
        if (text!=null && text.length()>5){
            System.out.println(text);
        }
    }

    public static void testCase2(){
        String text = null;
        // throws an exception
        if (text!=null & text.length()>5){
            System.out.println("This is the text");
        }
    }

    public static void testCase3(){
        String text = null;
        if (text!=null & text.length()>5){
            //continue; //DOES NOT COMPILE
        }
    }

    public static void testCase4(){
        /*
        int x = 0;
        String s = null;
        if (x==s){
            System.out.println("Does not compile the condition");
        }*///DOES NOT COMPILE
    }

}
