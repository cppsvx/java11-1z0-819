package com.craneos.java11.part2.chapter15.streams.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamMisc {

    public static void main(String[] args){
        test();
    }

    public static void test(){
        System.out.println("\n----------------------------- test ------------------------");
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        //System.out.println(stream.count());
        stream.forEach(System.out::println);
    }

}
