package com.craneos.java11.part2.chapter18.stateful;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleStateful {

    public static void main(String[] args) {
        testStatefulBad();
        testStatefulBadParallel();
        testStatefulOk();
        testStatefulOkParallel();
    }

    private static void testStatefulBad(){
        System.out.println("\n----------------------------- testStatefulBad ------------------------");
        var list = addValues(IntStream.range(1, 11));
        System.out.println(list);
    }

    private static void testStatefulBadParallel(){
        System.out.println("\n----------------------------- testStatefulBadParallel ------------------------");
        var list = addValues(IntStream.range(1, 11).parallel());
        System.out.println(list);
    }

    public static List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0).forEach(i -> { data.add(i); }); // STATEFUL: DON'T DO THIS!
        return data;
    }

    private static void testStatefulOk(){
        System.out.println("\n----------------------------- testStatefulOk ------------------------");
        var list = addValues2(IntStream.range(1, 11));
        System.out.println(list);
    }

    private static void testStatefulOkParallel(){
        System.out.println("\n----------------------------- testStatefulOkParallel ------------------------");
        var list = addValues2(IntStream.range(1, 11).parallel());
        System.out.println(list);
    }

    public static List<Integer> addValues2(IntStream source) {
        return source.filter(s -> s % 2 == 0).boxed().collect(Collectors.toList());
    }

}
