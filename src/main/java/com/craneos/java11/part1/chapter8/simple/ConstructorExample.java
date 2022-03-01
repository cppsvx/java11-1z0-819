package com.craneos.java11.part1.chapter8.simple;

public class ConstructorExample {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1(){
        System.out.println("----------- CONSTRUCTOR 1 --------------");
        Animal animal = new Animal(43);
        System.out.println("animal --> "+animal);
    }
}
