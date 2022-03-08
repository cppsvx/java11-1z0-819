package com.craneos.java11.part2.chapter14.staticrefs;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleStaticReference {

    public static void main(String[] args){
        testCallingStaticMethods("Message to write");
        testCallingInstanceMethodsOnObject("Message to write");
        testCallingInstanceMethodsOnObject2("Message to write");
        testCallingInstanceMethodsOnParameter("Message to write");
        testCallingInstanceMethodsOnParameter2("Message to write");
    }

    public static void testCallingStaticMethods(String parameter) {
        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);
    }

    public static void testCallingInstanceMethodsOnObject(String parameter) {
        var random = new Random();
        Supplier<Integer> methodRef = random::nextInt;
        Supplier<Integer> lambda = () -> random.nextInt();
    }

    public static void testCallingInstanceMethodsOnObject2(String parameter) {
        var random = new Random();
        Supplier<Integer> methodRef = random::nextInt;
        Supplier<Integer> lambda = () -> random.nextInt();
    }

    public static void testCallingInstanceMethodsOnParameter(String parameter) {
        Predicate<String> methodRef = String::isEmpty;
        Predicate<String> lambda = s -> s.isEmpty();
    }

    public static void testCallingInstanceMethodsOnParameter2(String parameter) {
        BiPredicate<String, String> methodRef = String::startsWith;
        BiPredicate<String, String> lambda = (s, p) -> s.startsWith(p);
    }
}