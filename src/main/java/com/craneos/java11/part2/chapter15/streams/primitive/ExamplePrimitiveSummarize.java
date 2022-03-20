package com.craneos.java11.part2.chapter15.streams.primitive;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExamplePrimitiveSummarize {

    public static void main(String[] args){
        testPrimitiveSummarize1();
        testPrimitiveSummarize2();
        testPrimitiveSummarize3();
    }

    public static void testPrimitiveSummarize1(){
        System.out.println("\n----------------------------- testPrimitiveSummarize1 ------------------------");
        IntStream ints1 = Arrays.stream(new int[]{1,2,3,4,5,53});
        OptionalInt optional = ints1.max();
        System.out.println(optional.orElseThrow(RuntimeException::new));
    }

    public static void testPrimitiveSummarize2(){
        System.out.println("\n----------------------------- testPrimitiveSummarize2 ------------------------");
        try {
            IntStream ints1 = Arrays.stream(new int[]{});
            OptionalInt optional = ints1.max();
            System.out.println(optional.orElseThrow(RuntimeException::new));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void testPrimitiveSummarize3() {
        System.out.println("\n----------------------------- testPrimitiveSummarize3 ------------------------");
        IntStream ints1 = Arrays.stream(new int[]{1,2,3,4,5,53});
        IntSummaryStatistics stats = ints1.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        System.out.println(stats.getMax()-stats.getMin()); // 52
    }

}
