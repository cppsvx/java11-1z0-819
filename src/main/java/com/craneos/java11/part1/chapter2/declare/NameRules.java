package com.craneos.java11.part1.chapter2.declare;

public class NameRules {

    static long okidentifier;
    static long OKidentifier;
    static float $OK2Identifier;
    static boolean _alsoOK1d3ntifi3r;
    static char __SStillOkbutKnotsonice$;
    static boolean b1, b2;
    static String s1 = "1", s2;
    static int i1; int i2;
    // static double d1, double d2; // DOES NOT COMPILE
    //static int i3; i4; // DOES NOT COMPILE

    //These examples are not legal:
    //int 3DPointClass; // identifiers cannot begin with a number
    //byte hollywood@vine; // @ is not a letter, digit, $ or _
    //String *$coffee; // * is not a letter, digit, $ or _
    //double public; // public is a reserved word
    //short _; // a single underscore is not allowed

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1(){
        System.out.println("okidentifier="+okidentifier);
        System.out.println("OKidentifier="+OKidentifier);
        System.out.println("$OK2Identifier="+$OK2Identifier);
        System.out.println("_alsoOK1d3ntifi3r="+_alsoOK1d3ntifi3r);
        System.out.println("b1="+b1);
        System.out.println("b2="+b2);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("i1="+i1);
        //System.out.println("i2="+i2); // Not STATIC. DOES NOT COMPILE
    }
}
