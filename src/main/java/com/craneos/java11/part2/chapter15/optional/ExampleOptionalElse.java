package com.craneos.java11.part2.chapter15.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

class MyException extends NoSuchElementException {

}

public class ExampleOptionalElse {

    public static void main(String[] args){
        testElse(null);
        testElseGet(null);
        testElseThrow(null);
    }

    public static void testElse(Double number) {
        System.out.println("\n----------------------------- test Else ------------------------");
        Optional<Double> opt = Optional.ofNullable(number);
        System.out.println(opt.orElse(Double.NaN));
    }

    public static void testElseGet(Double number) {
        System.out.println("\n----------------------------- test Else Get ------------------------");
        Optional<Double> opt = Optional.ofNullable(number);
        System.out.println(opt.orElseGet(() -> Math.random()));
    }

    public static void testElseThrow(Double number) {
        System.out.println("\n----------------------------- test Else Throw ------------------------");
        Optional<Double> opt = Optional.ofNullable(number);
        System.out.println(opt.orElseThrow());
        //System.out.println(opt.orElseThrow(()->new MyException())); // This is valid
    }

}
