package com.craneos.java11.part1.chapter5.strings;

public class StringConcat {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    private static void testCase1(){
        System.out.println("--------- ALL --------");
        String helloString = "hello";
        String worldString = "world";

        // firstString will be “hello world”, concats 3 literals..
        String firstString = helloString + " " + worldString;
        System.out.println("firstString = " + firstString);

        Object nullObject = null;
        // secondString will be “null hello"
        String secondString = nullObject + " " + helloString;
        System.out.println("secondString = " + secondString);

        int i = 10;
        // thirdString will be “10 hello"
        String thirdString = i + " " + helloString;
        System.out.println("thirdString = " + thirdString);

        int j = 10;
        String resultString = i + j + " = " + i + j;
        System.out.println("resultString is: " + resultString);

        String resultStringCorrectedForIntegerMath = i + j + " = " + (i + j);
        String resultStringCorrectedForStringConcat = "" + i + j + " = " + i + j;
        System.out.println("resultStringCorrectedForIntegerMath is: " +
                resultStringCorrectedForIntegerMath);
        System.out.println("resultStringCorrectedForStringConcat is: " +
                resultStringCorrectedForStringConcat);
    }

    private static void testCase2(){
        System.out.println("--------- STRING + REFERENCE --------");
        String helloString = "hello";
        // concatenating to an object (not null)
        Object ourObject = new OurSimpleClass();

        // fourthString will be "hello Our Simple Class"
        String fourthString = helloString + " " + ourObject;
        System.out.println("fourthString = " + fourthString);
    }

    private static void testCase3(){
        System.out.println("--------- STRING OPERATOR OVERLOAD --------");
        int i = 10;
        int j = 10;
        String resultString = i + j + " = " + i + j;
        System.out.println("resultString is: " + resultString);
    }

}

class OurSimpleClass {
    public String toString() {
        return "Our Simple Class";
    }
}