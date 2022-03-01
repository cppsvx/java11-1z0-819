package com.craneos.java11.part1.chapter2.types;

public class BinaryExample {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1(){
        //  8-bit 'byte' values:
        byte byte1 = (byte) 0b01111111;  // 127
        byte byte2 = (byte) 0b10000000;  // -128
        byte byte3 = (byte) 0b00100001; // 33

        // A 16-bit 'short' value:
        short short1 = (short) 0b10100001_01000101; // -24251

        // Some 32-bit 'int' values:
        int int1 = 0b10100001_01000101_10100001_01000101;  // -1589272251
        int int2 = 0b101; // 5
        int int3 = 0B101; // The B in literal can be upper/lower case.  //5
        int int4 = 0B00000000_00000000_00000000_00000101; // The B in literal can be upper/lower case.  //5
        // A 64-bit 'long' value. Note the "L" suffix:
        long long1 = 0b1010000101000101101000010100010110100001010001011010000101000101L; // -6825872339779608251
        long long2 = 0b0000000_000000000_00000000_00000000_00000000_00000000_00000000_00000101; // -6825872339779608251

        System.out.println("byte1=" + byte1);
        System.out.println("byte2=" + byte2);
        System.out.println("byte3=" + byte3);

        System.out.println("short1=" + short1);

        System.out.println("int1=" + int1);
        System.out.println("int2=" + int2);
        System.out.println("int3=" + int3);
        System.out.println("int4=" + int3);

        System.out.println("long1=" + long1);
        System.out.println("long2=" + long2);
    }

}
