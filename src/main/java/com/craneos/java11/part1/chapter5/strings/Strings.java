package com.craneos.java11.part1.chapter5.strings;

public class Strings {

    public static void main(String[] args) {
        testCaseTrim();
        testCaseSubstring();
        testCaseStringGarbageCollector();
        testCaseStringBuilder();
    }

    public static void testCaseStringGarbageCollector(){
        // In this example 27 objects are instantiated
        System.out.println("--------- GARBAGE COLLECTOR --------");
        String alpha = "";
        for(char current='a'; current<='z'; current++){
            alpha += current;
        }
        System.out.println(alpha);
    }

    public static void testCaseStringBuilder(){
        // Only one object instantiated
        System.out.println("--------- STRING BUILDER --------");
        StringBuilder alpha = new StringBuilder();
        for(char current='a'; current<='z'; current++){
            alpha.append(current);
        }
        System.out.println(alpha);
    }

    public static void testCaseTrim(){
        System.out.println("--------- TRIM --------");
        String string = "\t     a b c\n";
        String string2 = "     a b c\n";
        System.out.println("- Example 1 string 1: "+string);
        System.out.println("- Example 2 string 1: "+string.trim());
        System.out.println("- Example 1 string 2: "+string2.trim());
    }

    public static void testCaseSubstring(){
        System.out.println("--------- SUBSTRING --------");
        String string = "animals";
        System.out.println("- Example 1: "+string.substring(3));
        System.out.println("- Example 2: "+string.substring(string.indexOf('m')));
        System.out.println("- Example 3: "+string.substring(3, 4));
        System.out.println("- Example 4: "+string.substring(3, 7));
        System.out.println("- Example 5: "+string.substring(3, 3));
        //System.out.println("- Example 6: "+string.substring(3, 2)); //throws an exception
        //System.out.println("- Example 6: "+string.substring(3, 9)); //throws an exception
    }

}
