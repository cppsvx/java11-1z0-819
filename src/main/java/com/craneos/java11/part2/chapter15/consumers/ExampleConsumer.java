package com.craneos.java11.part2.chapter15.consumers;

import java.util.function.Consumer;

public class ExampleConsumer {

    public static void main(String[] args){
        testConsumers1();
    }

    public static void testConsumers1() {
        System.out.println("\n----------------------------- testConsumers1 ------------------------");
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");
    }

}