package com.craneos.java11.part1.chapter6.functional.consumers;

import java.util.function.Consumer;

public class SimpleConsumer {

    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        print(consumer, "Hello World");
    }

    private static void print(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }
}