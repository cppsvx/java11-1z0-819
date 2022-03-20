package com.craneos.java11.part2.chapter16.localization;

import java.text.NumberFormat;
import java.util.Locale;

public class ExampleLocalization {

    public static void main(String[] args){
        testLocale1();
        testLocale2();
        testLocale3();
    }

    /**
     * US // Cannot have country without language
     * enUS // Missing underscore
     * US_en // The country and language are reversed
     * EN // Language must be lowercase
     */
    public static void testLocale1() {
        System.out.println("\n----------------------------- testLocale1 ------------------------");
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
        System.out.println("l1 --> "+l1);
        System.out.println("l2 --> "+l2);
    }

    public static void testLocale2() {
        System.out.println("\n----------------------------- testLocale2 ------------------------");
        System.out.println(Locale.getDefault()); // en_US
        Locale locale = new Locale("fr");
        Locale.setDefault(locale); // change the default
        System.out.println(Locale.getDefault()); // fr
    }

    public static void testLocale3() {
        System.out.println("\n----------------------------- testLocale3 ------------------------");
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;
        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));
        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));
    }
}
