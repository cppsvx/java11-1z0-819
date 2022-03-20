package com.craneos.java11.part2.chapter15.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class ExampleOptional {

    public static void main(String[] args){
        testOptional1(5, 25);
        testOptional2(90, 100);
        testOptional3();
        testNullable(null);
        testIfPresent("message test");
    }

    public static Optional<Double> testOptional1(int... scores) {
        System.out.println("\n----------------------------- test Optional 1 ------------------------");
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        System.out.println("optional 1: "+Optional.of((double) sum / scores.length));
        return Optional.of((double) sum / scores.length);
    }

    public static void testOptional2(int... scores) {
        System.out.println("\n----------------------------- test Optional 2 ------------------------");
        Optional<Double> opt = testOptional1(scores);
        if (opt.isPresent())
            System.out.println("optional 2: "+opt.get()); // 95.0
    }

    public static void testOptional3(int... scores) {
        try{
            System.out.println("\n----------------------------- test Optional 3 ------------------------");
            Optional<Double> opt = testOptional1(scores);
            System.out.println("optional 2: "+opt.get()); // 95.0
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void testNullable(String message) {
        System.out.println("\n----------------------------- test Nullable ------------------------");
        Optional optional1 = (message == null) ? Optional.empty() : Optional.of(message);
        Optional optional2 = Optional.ofNullable(message);
        System.out.println("optional1 = "+optional1);
        System.out.println("optional2 = "+optional2);

        // ERROR!!
        try{
            Optional optional3 = Optional.of(message);
            System.out.println("optional3 = "+optional3);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void testIfPresent(String message) {
        System.out.println("\n----------------------------- test If Present ------------------------");
        Consumer<String> consumer = x -> {
            x = x.concat(".... testing.....");
            System.out.println(x);
        };
        System.out.println("\n-- opt.ifPresent(System.out::println); ---> ");
        Optional<String> opt = Optional.ofNullable(message);
        opt.ifPresent(System.out::println);
        System.out.println("\n-- opt.ifPresent(consumer) ---> ");
        opt.ifPresent(consumer);
        System.out.println("\n-- consumer.accept(message); ---> ");
        consumer.accept(message);
    }

}
