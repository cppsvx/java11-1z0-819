package com.craneos.java11.part2.chapter14.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * A TreeSet stores its elements in a sorted tree structure. The main benefit
 * is that the set is always in sorted order. The trade‐off is that adding and
 * checking whether an element exists take longer than with a HashSet,
 * especially as the tree grows larger.
 */
public class ExampleSet {

    public static void main(String... xyz) {
        testSet();
        testHashSet();
        testTreeSet();
    }

    private static void testSet() {
        System.out.println("\n----------------------------- testSet ------------------------");
        Set<Character> letters = Set.of('z', 'o');
        Set<Character> copy = Set.copyOf(letters);
    }

    private static void testHashSet() {
        System.out.println("\n----------------------------- testHashSet ------------------------");
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        set.forEach(System.out::println);
    }

    private static void testTreeSet() {
        System.out.println("\n----------------------------- testTreeSet ------------------------");
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        set.forEach(System.out::println);
    }

}