package com.craneos.java11.part1.chapter5.strings;

public class StringComparison {

    public static void main(String[] args) {
        // Operand
        TestArrayOperand();
        TestArrayEquals();
        //  == operand
        TestEqualsOperand();
        //  public boolean equals(Object anObject)
        TestEqualsMethod();
        // ---- public boolean equalsIgnoreCase?(String anotherString)
        TestEqualsIgnoreCaseMethod();
        // ---- public boolean contentEquals?(CharSequence cs)
        TestContentEqualsMethod();
        // ---- public int compareTo?(String anotherString)
        TestCompareToMethod();
        // ----- public int compareToIgnoreCase?(String str)
        TestCompareToIgnoreCaseMethod();
    }

    public static void TestArrayOperand() {
        System.out.println("--------- ARRAY == --------");
        String firstString = "Hello";
        String secondString = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(String.format("(%s == %s) = " +
                (firstString == secondString), firstString, secondString));
    }

    public static void TestArrayEquals() {
        System.out.println("--------- ARRAY EQUALS --------");
        String firstString = "Hello";
        String secondString = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        boolean result = (firstString.equals(secondString));
        String output = String.format("(%s.equals(%s)) = " + result, firstString, secondString);
        System.out.println(output);
    }

    //  == operand
    // returns true when both objects refer to the same object, not the same value
    public static void TestEqualsOperand() {
        System.out.println("--------- == --------");
        String firstString = "hEllo";
        Object secondObject = "Hello";
        System.out.println(String.format("(%s == %s) = " +
                (firstString == secondObject), firstString, secondObject));
    }

    //  public boolean equals(Object anObject)
    //  returns true if references are the same,
    //  OR if parameter type is String AND the value is the same
    public static void TestEqualsMethod() {
        System.out.println("--------- EQUALS --------");
        String firstString = "hEllo";
        String stringHello1 = "Hello";  // String Literal, interned
        String secondString = stringHello1;     // Line 24
        Object secondObject = secondString; // Line 25
        try {
            System.out.println(String.format("%s.equals(%s) = " +
                    (firstString.equals(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    //  public boolean equalsIgnoreCase(Object anObject)
    //  returns true if two Strings have same value ignoring case
    public static void TestEqualsIgnoreCaseMethod() {
        System.out.println("--------- EQUALS IGNORE CASE --------");
        String firstString = "hEllo";
        String secondObject = "Hello";
        try {
            System.out.println(String.format("%s.equalsIgnoreCase(%s) = " +
                    (firstString.equalsIgnoreCase(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    //  public boolean contentEquals(CharSequence cs)
    //  returns true if values in String and the second passed parameter are the same.
    public static void TestContentEqualsMethod() {
        System.out.println("--------- CONTENT EQUALS --------");
        String firstString = "hEllo";
        String stringHello1 = "Hello";  // String Literal, interned
        String secondString = stringHello1;     // Line 24
        CharSequence secondSequence = secondString; // Line 26
        try {
            System.out.println(String.format("%s.contentEquals(%s) = " +
                    (firstString.contentEquals(secondSequence)), firstString, secondSequence));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondSequence, e.getClass().getName()));

        }
    }

    //  public int compareTo(String anotherString)
    //  Compares the value of Strings lexicographically
    public static void TestCompareToMethod() {
        System.out.println("--------- COMPARE TO --------");
        String firstString = "A";
        String secondString = "B";
        String result1 = String.format("%s.compareTo(%s) = " + (firstString.compareTo(secondString)), firstString, secondString);
        String result2 = String.format("%s.compareTo(%s) = " + (secondString.compareTo(firstString)), secondString, firstString);
        String result3 = String.format("%s.compareTo(%s) = " + (firstString.compareTo(firstString)), firstString, firstString);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    // public int compareToIgnoreCase(String str)
    //  Compares the value of Strings lexicographically ignoring case
    public static void TestCompareToIgnoreCaseMethod() {
        System.out.println("--------- COMPARE TO IGNORE CASE --------");
        String firstString = "hEllo";
        String secondString = "Hello";
        try {
            System.out.println(String.format("%s.compareToIgnoreCase(%s) = " +
                    (firstString.compareToIgnoreCase(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }
}