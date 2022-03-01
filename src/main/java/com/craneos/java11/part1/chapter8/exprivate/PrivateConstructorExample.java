package com.craneos.java11.part1.chapter8.exprivate;

public class PrivateConstructorExample {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1(){
        System.out.println("----------- CONSTRUCTOR 1 --------------");
        Animal.Dolphin animal = new Animal.Dolphin(43);
        System.out.println("animal --> "+animal);
    }
}
