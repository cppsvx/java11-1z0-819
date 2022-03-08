package com.craneos.java11.part2.chapter14.diamond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ExampleDiamonds {

    public static void main(String[] args){
        testCase1();
    }

    private static void testCase1(){
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<String,Integer>();
        Map<Long,List<Integer>> mapOfLists = new HashMap<>();

        //List<> list = new ArrayList<Integer>(); // DOES NOT COMPILE
        //Map<> map = new HashMap<String, Integer>(); // DOES NOT COMPILE
        class InvalidUse {
            //void use(List<> data) {} // DOES NOT COMPILE
        }

        var list1 = new ArrayList<Integer>();
        var list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
    }

}
