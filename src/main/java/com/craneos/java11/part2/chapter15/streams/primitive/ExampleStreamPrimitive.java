package com.craneos.java11.part2.chapter15.streams.primitive;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * PRIMITIVE STREAMS
 * IntStream: Used for the primitive types int, short, byte, and char
 * LongStream: Used for the primitive type long
 * DoubleStream: Used for the primitive types double and float
 */
public class ExampleStreamPrimitive {

    public static void main(String[] args){
        testPrimitive1();
        testPrimitive2();
        testPrimitive3();
        testFlatMap();
    }

    public static void testPrimitive1(){
        System.out.println("\n----------------------------- testPrimitive1 ------------------------");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        System.out.println(stream.reduce(0, (s, n) -> s + n)); // 6
    }

    public static void testPrimitive2(){
        System.out.println("\n----------------------------- testPrimitive2 ------------------------");
        Stream<Integer> stream = Stream.of(1, 2, 3, 5);
        System.out.println(stream.mapToInt(x -> x).sum()); // 11
    }

    public static void testPrimitive3(){
        System.out.println("\n----------------------------- testPrimitive3 ------------------------");
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble()); // 2.0
    }

    public static void testFlatMap(){
        System.out.println("\n----------------------------- testFlatMap ------------------------");
        var integerList = new ArrayList<Integer>();
        integerList.add(4);
        integerList.add(10);
        IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubles = integerList.stream().flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longs = integerList.stream().flatMapToLong(x -> LongStream.of(x));

        System.out.println("\n- ints: ");
        ints.forEach(System.out::println);
        System.out.println("\n- doubles: ");
        doubles.forEach(System.out::println);
        System.out.println("\n- longs: ");
        longs.forEach(System.out::println);
    }

}
