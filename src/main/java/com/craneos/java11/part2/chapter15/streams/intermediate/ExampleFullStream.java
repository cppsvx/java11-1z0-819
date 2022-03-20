package com.craneos.java11.part2.chapter15.streams.intermediate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFullStream {

    public static void main(String[] args){
        testNoStream1();
        testFullStream1();
        testDoubleStream();
    }

    public static void testNoStream1(){
        System.out.println("\n----------------------------- testNoStream1 ------------------------");
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name: list)
            if (name.length() == 4) filtered.add(name);
        Collections.sort(filtered);
        var iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());
    }

    public static void testFullStream1(){
        System.out.println("\n----------------------------- testFullStream1 ------------------------");
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        list.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);
    }

    public static void testDoubleStream(){
        System.out.println("\n----------------------------- testDoubleStream ------------------------");
        long count1 = Stream.of("goldfish", "finch", "dddddddddddddddddd", "aa")
                .filter(s -> s.length()> 5)
                .collect(Collectors.toList()).stream().count();
        System.out.println(count1); // 2
        //
        long count2 = Stream.of("goldfish", "finch", "dddddddddddddddddd", "aa")
                .filter(s -> s.length()> 5)
                .count();
        System.out.println(count2); // 1
    }
}
