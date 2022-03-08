package com.craneos.java11.part2.chapter14.constructorrefs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleConstructorReference {

    public static void main(String[] args){
        testCallingConstructor("Message to write");
    }

    public static void testCallingConstructor(String paramter) {
        Supplier<List<String>> methodRef = ArrayList::new;
        Supplier<List<String>> lambda = () -> new ArrayList();
    }

    public static void testCallingConstructor2(String parameter) {
        Function<Integer, List<String>> methodRef = ArrayList::new;
        Function<Integer, List<String>> lambda = x -> new ArrayList(x);
    }

}
