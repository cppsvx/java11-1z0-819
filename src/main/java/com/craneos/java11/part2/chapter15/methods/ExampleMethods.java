package com.craneos.java11.part2.chapter15.methods;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleMethods {

    public static void main(String[] args){
        testPredicateMethods1("color ddddd");
        testPredicateMethods2("color brown");
        testConsumerMethods1("cppsvx ar360");
        testFunctionMethods1(3);
    }

    public static void testPredicateMethods1(String text) {
        System.out.println("\n----------------------------- test Predicate Methods1 ------------------------");
        //Predicate<String> color = s -> s.contains("color");
        //Predicate<String> color = s -> s.contains("brown");

        Predicate<String> brownColor = s -> s.contains("color") && s.contains("brown");
        Predicate<String> otherColor = s -> s.contains("color") && ! s.contains("brown");

        System.out.println("brownEggs test: "+brownColor);
        System.out.println("otherEggs test: "+otherColor);
        System.out.println("brownEggs test: "+brownColor.test(text));
        System.out.println("otherEggs test: "+otherColor.test(text));
    }

    public static void testPredicateMethods2(String text) {
        System.out.println("\n----------------------------- test Predicate Methods2 ------------------------");
        Predicate<String> color = s -> s.contains("color");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownColor = color.and(brown);
        Predicate<String> brownOrColor = color.or(brown);
        Predicate<String> otherColor = color.and(brown.negate());

        System.out.println("brown Color test: "+brownColor);
        System.out.println("brown Or Color test: "+brownOrColor);
        System.out.println("other Color test: "+otherColor);
        System.out.println("brown Color test: "+brownColor.test(text));
        System.out.println("brown Or Color test: "+brownOrColor.test(text));
        System.out.println("other Color test: "+otherColor.test(text));
    }

    public static void testConsumerMethods1(String text) {
        System.out.println("\n----------------------------- test Consumer Methods1 ------------------------");
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);
        Consumer<String> combined = c1.andThen(c2);
        combined.accept(text); // 1: Annie,2: Annie
    }

    public static void testFunctionMethods1(int number) {
        System.out.println("\n----------------------------- test Function Methods1 ------------------------");
        Function<Integer, Integer> before = x -> x + 10;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> then = x -> x + 1000;
        Function<Integer, Integer> combined = after.compose(before).andThen(then);
        System.out.println("after(x -> x * 2).compose(x -> x + 10).andThen(x -> x + 1000) ---> "+combined.apply(number)); // 1026
        System.out.println("after.compose(before).andThen(then) ---> "+combined.apply(number)); // 1026
    }
}
