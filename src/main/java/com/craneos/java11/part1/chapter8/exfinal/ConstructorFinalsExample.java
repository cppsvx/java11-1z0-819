package com.craneos.java11.part1.chapter8.exfinal;

public class ConstructorFinalsExample {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1(){
        System.out.println("----------- CONSTRUCTOR 1 --------------");
        Mouse mouse = new Mouse();
        System.out.println("animal --> "+ mouse);
    }

}
