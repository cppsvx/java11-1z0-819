package com.craneos.java11.part1.chapter7.data;

public class PassingDataExample2 {

    public static void main(String[] args) {
        int number = 1;
        String letters = "abc";
        number(number);
        letters = letters(letters);
        System.out.println(number + letters);
    }

    public static int number(int number) {
        System.out.println("Value of number before number++: "+number);
        number++;
        System.out.println("Value of number after number++: "+number);
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }

}
