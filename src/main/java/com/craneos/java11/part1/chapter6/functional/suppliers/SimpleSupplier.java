package com.craneos.java11.part1.chapter6.functional.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class SimpleSupplier {

    public static void main(String[] args) {
        Supplier<Integer> number = () -> 42;
        Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(returnNumber(number));
        System.out.println(returnNumber(random));
    }
    private static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
