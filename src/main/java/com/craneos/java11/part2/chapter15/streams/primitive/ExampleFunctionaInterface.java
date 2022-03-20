package com.craneos.java11.part2.chapter15.streams.primitive;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

public class ExampleFunctionaInterface {

    public static void main(String[] args){
        testBooleanInterface();
        testDoubleInterface();
    }

    public static void testBooleanInterface(){
        System.out.println("\n----------------------------- testBooleanInterface ------------------------");
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random()> .5;

        System.out.println(b1.getAsBoolean()); // true
        System.out.println(b2.getAsBoolean()); // false
    }

    public static void testDoubleInterface(){
        System.out.println("\n----------------------------- testDoubleInterface ------------------------");
        DoubleSupplier b1 = () -> 5.5;

        System.out.println(b1.getAsDouble()); // 5.5
    }

}
