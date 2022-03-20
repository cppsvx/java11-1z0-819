package com.craneos.java11.part2.chapter14.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleLists {

    public static void main(String... xyz) {
        testCreatingLists();
        testModifyLists();
        testReplaceAll();
    }

    private static void testCreatingLists() {
        System.out.println("\n----------------------------- testCreatingLists ------------------------");
        String[] array = new String[]{"a", "b", "c"};
        System.out.println("array = a, b, c"); // [a, b, c]
        System.out.println("---------------");
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array); // [a, b, c]
        List<String> copy = List.copyOf(asList); // [a, b, c]

        array[0] = "z";
        //of.add("r"); // throws UnsupportedOperationException. Fails at runtime due to it is a ImmutableCollections
        //copy.add("s"); // throws UnsupportedOperationException. Fails at runtime due to it is a ImmutableCollections

        System.out.println("Arrays.asList(array) = " + asList); // [z, b, c]
        System.out.println("List.of(array) = " + of); // [a, b, c]
        System.out.println("List.copyOf(asList) = " + copy); // [a, b, c]

        asList.set(0, "x");
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array)); // [x, b, c]
    }

    private static void testModifyLists() {
        System.out.println("\n----------------------------- testModifyLists ------------------------");
        List<String> list = new ArrayList<>();
        System.out.println("list = new ArrayList<>() -----> "+list);
        list.add("SD"); // [SD]
        System.out.println("list.add(\"SD\") -------------> "+list);
        list.add(0, "NY"); // [NY,SD]
        System.out.println("list.add(0, \"NY\") ----------> "+list);
        list.set(1, "FL"); // [NY,FL]
        System.out.println("list.set(1, \"FL\") ----------> "+list);
        System.out.println("list.get(0) ------------------> "+list.get(0)); // NY
        list.remove("FL"); // [NY]
        System.out.println("list.remove(\"FL\") --> "+list); // NY
        list.remove(0); // []
        System.out.println("list.remove(0) --> "+list); // NY
        //list.set(0, "?"); // IndexOutOfBoundsException
    }

    private static void testReplaceAll() {
        System.out.println("\n----------------------------- testReplaceAll ------------------------");
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x*2);
        System.out.println(numbers); // [2, 4, 6]
    }

}
