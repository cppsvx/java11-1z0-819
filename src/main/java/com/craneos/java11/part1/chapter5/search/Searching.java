package com.craneos.java11.part1.chapter5.search;

import java.util.Arrays;

public class Searching {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1(){
        int[] numbers = {2,4,6,8};
        System.out.println("Arrays.binarySearch(numbers, 2)-->"+Arrays.binarySearch(numbers, 2)); // 0
        System.out.println("Arrays.binarySearch(numbers, 4)-->"+Arrays.binarySearch(numbers, 4)); // 1
        System.out.println("Arrays.binarySearch(numbers, 6)-->"+Arrays.binarySearch(numbers, 6)); // 2
        System.out.println("Arrays.binarySearch(numbers, 8)-->"+Arrays.binarySearch(numbers, 8)); // 3
        System.out.println("Arrays.binarySearch(numbers, 0)-->"+Arrays.binarySearch(numbers, 0)); // -1
        System.out.println("Arrays.binarySearch(numbers, 1)-->"+Arrays.binarySearch(numbers, 1)); // -1
        System.out.println("Arrays.binarySearch(numbers, 3)-->"+Arrays.binarySearch(numbers, 3)); // -2
        System.out.println("Arrays.binarySearch(numbers, 9)-->"+Arrays.binarySearch(numbers, 9)); // -5
    }

}
