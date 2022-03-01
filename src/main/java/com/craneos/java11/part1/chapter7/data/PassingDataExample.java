package com.craneos.java11.part1.chapter7.data;

public class PassingDataExample {

    public static void main(String[] args) {
        int num = 4;
        System.out.println("---------- VALUE BY VALUE 1 ------------");
        System.out.println("Previous value of num = "+num);
        testCaseByValue(num);
        System.out.println("Value of num = "+num);

        String number = "23";
        System.out.println("---------- VALUE BY VALUE 2 ------------");
        System.out.println("Previous value of num = "+number);
        testCaseByValue(number);
        System.out.println("Value of num = "+number);

        StringBuilder word = new StringBuilder("Hi ");
        System.out.println("---------- VALUE BY REFERENCE");
        System.out.println("Previous value of word = "+word);
        testCaseByReference(word);
        System.out.println("Value of word = "+word);
    }

    public static void testCaseByValue(int num) {
        System.out.println("int passed by value --> "+num);
        System.out.println("int passed by value --> "+(num+6));
    }

    public static void testCaseByValue(String number) {
        System.out.println("String passed by value --> "+number);
        number = "67";
        System.out.println("String passed by value --> "+number);
    }

    public static void testCaseByReference(StringBuilder word) {
        System.out.println("StringBuilder passed by reference --> "+word);
        word.append("Webby");
        System.out.println("StringBuilder passed by reference --> "+word);
    }
}
