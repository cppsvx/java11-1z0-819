package com.craneos.java11.part1.chapter3.precedence;

public class UnaryOperatorMore {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    public static void testCase1() {
        // unary Minus
        int a = 1, b = -a;
        // Note that the value of actual operand a does not change
        System.out.println("a = " + a + "; b = " + b);

        //
        a = -1;
        b = -a;
        System.out.println("a = " + a + "; b = " + b);

        //  Unary Plus
        a = 1;
        b = +a;  // Not to mistaken for b+=a;
        System.out.println("a = " + a + "; b = " + b);
        a = -1;
        b = +a;
        System.out.println("a = " + a + "; b = " + b);
    }

    public static void testCase2(){
        // Bitwise Complement Operator  ~a
        // when value is x then ~x = (-x)-1;
        int bin1 = 0b00000000_00000000_00000000_00000000;
        int bin2 = ~bin1;
        int bin3 = 0b00000001_00000000_00000000_00000000;
        int bin4 = ~bin3;

        System.out.println("bin1 = " + bin1 + " (" + Integer.toBinaryString(bin1) + "), " + "bin2 = " + bin2 + " (" + Integer.toBinaryString(bin2) + ")");
        System.out.println("bin3 = " + bin3 + " (" + Integer.toBinaryString(bin3) + "), " + "bin4 = " + bin4 + " (" + Integer.toBinaryString(bin4) + ")");
    }

    public static void testCase3(){
        // Logical Complement Operator  !a
        boolean myBoolean = false;
        boolean newBoolean = !myBoolean;
        System.out.println("myBoolean = " + myBoolean + ", the opposite is = " + newBoolean);
    }
}
