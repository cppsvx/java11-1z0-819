package com.craneos.java11.part2.chapter15.streams.primitive;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ExamplePrimitiveOptional {

    public static void main(String[] args){
        testPrimitiveOptional1();
        testPrimitiveOptional2();
    }

    public static void testPrimitiveOptional1(){
        System.out.println("\n----------------------------- testPrimitiveOptional1 ------------------------");
        var stream1 = IntStream.rangeClosed(1,10);
        stream1.forEach(System.out::print);

        System.out.println("\n--------------------");
        var stream2 = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream2.average();
        optional.ifPresent(System.out::println); // 5.5
        System.out.println(optional.getAsDouble()); // 5.5
        System.out.println(optional.orElseGet(() -> Double.NaN)); // 5.5
    }

    public static void testPrimitiveOptional2(){
        System.out.println("\n----------------------------- testPrimitiveOptional2 ------------------------");
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15

        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min();
        System.out.println(min); // runs infinitely
    }

}
