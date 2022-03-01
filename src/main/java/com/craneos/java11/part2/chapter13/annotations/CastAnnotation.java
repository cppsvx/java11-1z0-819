package com.craneos.java11.part2.chapter13.annotations;

@interface ExampleCast {
    String results();
}

@interface ExampleCast2 {
    String key = "VALUE";
}

@ExampleCast(results="a")
public class CastAnnotation {
    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1() {
        System.out.println("\n");
        @ExampleCast(results="b") String castingA = "carrots";
        @ExampleCast(results="b") String castingB = (String)"carrots";
        //@ExampleCast(results="b") String castingC = (@ExampleCast2 String)"carrots";
    }

}
