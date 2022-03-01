package com.craneos.java11.part1.chapter5.sorting;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }

    private static void testCase1(){
        System.out.println("--------- SORT NUMBERS --------");
        int[] numbers = { 6, 9, 1 };
        System.out.print("numbers --> ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.print("\nArrays.sort(numbers) --> ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void testCase2(){
        System.out.println("\n--------- SORT LETTERS --------");
        char[] letters = { 'E', 'G', 'A', 'Z' };
        System.out.print("letters --> ");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        Arrays.sort(letters);
        System.out.print("\nArrays.sort(letters) --> ");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
    }

    private static void testCase3(){
        System.out.println("\n--------- SORT WORDS --------");
        String[] words = { "Estupor", "Gerona", "Albacete", "Zarigüella" };
        System.out.print("words --> ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        Arrays.sort(words);
        System.out.print("\nArrays.sort(words) --> ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

    private static void testCase4(){
        System.out.println("\n--------- SORT WORDS NUMBERS --------");
        String[] words = { "Estupor", "Gerona", "Albacete", "90", "Zarigüella", "32", "1 0" };
        System.out.print("words numbers --> ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        Arrays.sort(words);
        System.out.print("\nArrays.sort(words numbers) --> ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

    private static void testCase5(){
        System.out.println("\n--------- SORT STRING NUMBERS --------");
        String[] words = { "10", "9", "100", "99999"};
        System.out.print("string numbers --> ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        Arrays.sort(words);
        System.out.print("\nArrays.sort(string numbers) --> ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
