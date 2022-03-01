package com.craneos.java11.part1.chapter5.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCaseSorting();
    }

    private static void testCase1() {
        System.out.println("--------- ARRAYLIST 1 --------");
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();
        //ArrayList<> list6 = new ArrayList<String>(); // DOES NOT COMPILE
        //ArrayList<> list6 = new ArrayList<>(); // DOES NOT COMPILE
        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s: strings) { }

        var list = new ArrayList<>();
        list.add("a");
        //for (String s: list) { } // DOES NOT COMPILE. REQUIRES AN OBJECT
    }

    private static void testCase2() {
        System.out.println("--------- ARRAYLIST 2 --------");
        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list); // [hawk, true]
    }

    private static void testCase3() {
        System.out.println("--------- ARRAYLIST 3 --------");
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE); // DOES NOT COMPILE

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]
    }

    private static void testCase4() {
        System.out.println("--------- ARRAYLIST 4 --------");
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        list.clear();
        System.out.println("objectArray.length--> "+objectArray.length); // 2
        System.out.println("objectArray: "+objectArray[0]); // 2
        System.out.println("stringArray.length"+stringArray.length); // 2
        System.out.println("stringArray: "+stringArray[0]); // 2
    }

    private static void testCaseSorting() {
        System.out.println("--------- ARRAYLIST SORTING --------");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); // [5, 81, 99]
    }

}
