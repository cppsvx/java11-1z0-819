package com.craneos.java11.part2.chapter15.streams.intermediate;

import java.util.stream.Stream;

/**
 * The peek() method is useful for seeing how a stream pipeline works
 * behind the scenes. Remember that the methods run against each
 * element one at a time until processing is done.
 */
public class ExampleStreamPeek {

    public static void main(String[] args){
        testPeek1();
        testPeek2();
        testPeek3();
        testPeek4();
    }

    public static void testPeek1(){
        System.out.println("\n----------------------------- testPeek1 ------------------------");
        var infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print); // 135
    }

    public static void testPeek2(){
        System.out.println("\n----------------------------- testPeek2 ------------------------");
        var infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);
    }

    public static void testPeek3(){
        System.out.println("\n----------------------------- testPeek3 ------------------------");
        var infinite = Stream.iterate(1, x -> x + 1);
        infinite.filter(x -> x % 2 == 1)
                .limit(5)
                .forEach(System.out::print); // 13579
    }

    public static void testPeek4(){
        System.out.println("\n----------------------------- testPeek4 ------------------------");
        var infinite = Stream.iterate(1, x -> x + 1);
        infinite.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::print); // 1133557799
    }

}
