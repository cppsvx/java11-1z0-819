package com.craneos.java11.part1.chapter2.types;

public class PrimitiveTypes {

    static boolean tBoolean = false;
    // for NON decimal values
    static byte tMinByte = -128, tMaxByte = 127;
    static short tMinShort = 32767, tMaxShort = -32768;
    static int tMinInt = -2147483648, tMaxInt = 2147483647;
    static int tMinInteger = Integer.MIN_VALUE, tMaxInteger = Integer.MAX_VALUE;
    //static int tInt = 4.5; // DOES NOT COMPILE
    // separators
    static int bMillion_a = 1000000;
    static int bMillion_b = 1_000_000;
    static int bMillion_c = 1_0_0_00;
    static long bMaxLong = 123L;
    static long bMinLong = 123L;
    // for decimal values
    static float tFloat = 123.23f;
    static double tDouble = 123;
    static double tDouble1 = 1_000_000.0;
    static double tDouble2 = 1_000_000.0_0;
    //static int bMillion_d = 1_000_000_; // DOES NOT COMPILE
    //static int bMillion_e = _1_000_000; // DOES NOT COMPILE
    //static double tDouble3 = 1_000_000_.0; // DOES NOT COMPILE
    //static double tDouble4 = 1_000_000._0; // DOES NOT COMPILE
    //static double tDouble5 = 1_000_000_f; // DOES NOT COMPILE
    //static double tDouble6 = _1_000_000._0; // DOES NOT COMPILE

    // for chars
    static char bchar = 'a';
    // Other values
    static int intHexValue = 0xFF;
    static int intByteValue = 0b010;
    static int intOctalValue = 017032053;
    // Other variable names
    static String field1 = "aa";
    static String _field1 = "aa";
    static String $field1 = "aa";
    //static String 0field1 = "aa";   // DOES NOT COMPILE
    //static String 0field1 = "aa";   // DOES NOT COMPILE
    //static String fi*eld1 = "aa";   // DOES NOT COMPILE
    //static String *field1 = "aa";   // DOES NOT COMPILE
    //static String abstract = "aa";   // DOES NOT COMPILE

    public static void main(String[] args) {
        // First lets print out some ranges:
        System.out.println("A byte has a range of " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // We'll show character ranges both as unicode ranges and int ranges
        System.out.println("A char has a range of " + String.format("\\u%04x  to \\u%04x", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE));
        System.out.println("A char has a range of " + (int) Character.MIN_VALUE + "  to " + (int) Character.MAX_VALUE);
        System.out.println("A short has a range of " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("An int has a range of " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("A long has a range of " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("A float has a range of " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("A double has a range of " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);


        System.out.println("bMillion_a="+bMillion_a);
        System.out.println("bMillion_b="+bMillion_b);
        System.out.println("bMillion_c="+bMillion_c);
        System.out.println("intHexValue="+intHexValue);
        System.out.println("intByteValue="+intByteValue);
        System.out.println("intOctalValue="+intOctalValue);
    }

}
