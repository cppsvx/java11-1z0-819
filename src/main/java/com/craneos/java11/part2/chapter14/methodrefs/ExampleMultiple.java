package com.craneos.java11.part2.chapter14.methodrefs;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Counter {
    public static Integer countElements(String... messages)
    {
        return messages.length;
    }
}

public class ExampleMultiple {

    public static void main(String[] args){
        testCase1();
    }

    private static void testCase1(){
        Supplier<Integer> methodRef1 = Counter::countElements;
        Supplier<Integer> lambda1 = () -> Counter.countElements();

        Function<String, Integer> methodRef2 = Counter::countElements;
        Function<String, Integer> lambda2 = (x) -> Counter.countElements(x);

        BiFunction<String, String, Integer> methodRef3 = Counter::countElements;
        BiFunction<String, String, Integer> lambda3 = (x, y) -> Counter.countElements(x, y);
    }

}
