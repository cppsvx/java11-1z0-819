package com.craneos.java11.part2.chapter12.finals;

public class ExampleFinal {

    final static int age = 10;
    final int fishEaten;
    final String name;
    //final String surname; // DOES NOT COMPILE, not initialized

    { fishEaten = 10; }

    public ExampleFinal() {
        name = "Robert";
    }

    public static void main(String... xyz) {
        testCase1();
    }

    private static void testCase1(){
        final StringBuilder cobra = new StringBuilder();
        cobra.append("Hssssss");
        cobra.append(ExampleFinal.age);
        cobra.append("\n");
        cobra.append("final Stringbuilder, the final is the reference");
        System.out.println(cobra);
    }
}
