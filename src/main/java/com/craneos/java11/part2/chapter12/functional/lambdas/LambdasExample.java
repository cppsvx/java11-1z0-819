package com.craneos.java11.part2.chapter12.functional.lambdas;

public class LambdasExample {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    private static void testCase1() {
        System.out.println("\n----------- LAMBDA --------------");
        System.out.println("Examples of VALID Lambdas:");
        System.out.println("   () -> new Duck()\n" +
                "   d -> {return d.quack();}\n" +
                "   (Duck d) -> d.quack()\n" +
                "   (Animal a, Duck d) -> d.quack()");
        System.out.println("\nExamples of INVALID Lambdas:");
        System.out.println("   a, b -> a.startsWith(\"test\")           // DOES NOT COMPILE\n" +
                "   Duck d -> d.canQuack();                // DOES NOT COMPILE\n" +
                "   a -> { a.startsWith(\"test\"); }         // DOES NOT COMPILE\n" +
                "   a -> { return a.startsWith(\"test\") }   // DOES NOT COMPILE\n" +
                "   (Swan s, t) -> s.compareTo(t) != 0     // DOES NOT COMPILE\n");

    }

    private static void testCase2() {
        System.out.println("\n----------- LAMBDA - var in Parameter list --------------");
        System.out.println("If var is used for one of the types in the parameter list, then it must be used for all\n" +
                "all parameters in the list. Given this rule, which of the following lambda expressions do not\n" +
                "compile if they were assigned to a variable?");
        System.out.println("   (var num) -> 1\n" +
                "   var w -> 99                           // DOES NOT COMPILE\n" +
                "   (var a, var b) -> \"Hello\"\n" +
                "   (var a, Integer b) -> true            // DOES NOT COMPILE\n" +
                "   (String x, var y, Integer z) -> true  // DOES NOT COMPILE\n" +
                "   (var b, var k, var m) -> 3.14159\n" +
                "   (var x, y) -> \"goodbye\"               // DOES NOT COMPILE");

    }
}
