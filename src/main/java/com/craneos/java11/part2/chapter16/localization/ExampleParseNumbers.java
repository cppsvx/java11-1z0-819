package com.craneos.java11.part2.chapter16.localization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ExampleParseNumbers {


    public static void main(String[] args) throws ParseException {
        testParse1();
        testParse2();
    }

    public static void testParse1() throws ParseException {
        System.out.println("\n----------------------------- testParse1 ------------------------");
        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(s)); // 40.45
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s)); // 40
    }

    public static void testParse2(){
        System.out.println("\n----------------------------- testParse2 ------------------------");
        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d)); // 1,234,567.5

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d)); // 001,234,567.46700

        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println(f3.format(d)); // $1,234,567.47
    }

}
