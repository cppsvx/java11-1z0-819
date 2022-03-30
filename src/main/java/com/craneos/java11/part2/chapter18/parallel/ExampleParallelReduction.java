package com.craneos.java11.part2.chapter18.parallel;

import java.util.List;
import java.util.stream.Stream;

public class ExampleParallelReduction {

    public static void main(String[] args) {
        testOrderBased();
        //testStream();
        //testParallelStream();
        //testParallelStreamOrdered();
    }

    // Any stream operation that is based on order, including findFirst(),
    // limit(), or skip(), may actually perform more slowly in a parallel
    // environment.
    private static void testOrderBased(){
        System.out.println("\n----------------------------- testOrderBased 1 ------------------------");
        System.out.print(List.of(1,2,3,4,5,6)
                .stream()
                .findAny().get());

        System.out.println("\n----------------------------- testOrderBased 2 ------------------------");
        System.out.print(List.of(1,2,3,4,5,6)
                .parallelStream()
                .findAny().get());
    }

}
