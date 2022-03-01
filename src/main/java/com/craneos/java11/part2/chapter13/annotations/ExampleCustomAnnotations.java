package com.craneos.java11.part2.chapter13.annotations;

class Test {}

enum Size {SMALL, MEDIUM, LARGE}

@interface ExampleChecked {
    //Integer height();       // DOES NOT COMPILE. Integer and Long is not valid
    String[] results();
    //String[][] generalInfo(); // DOES NOT COMPILE. Nested arrays is not valid
    Size size() default Size.SMALL;
    //Test friendlyBear();         // DOES NOT COMPILE. Nested arrays is not valid
    Example exercise() default @Example(numberOfTestCases=2);
    public int voltage();
    int MIN_VOLTAGE = 2;
    public static final int MAX_VOLTAGE = 18;
}

@Example(numberOfTestCases=3)
public class ExampleCustomAnnotations {
    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1() {
        System.out.println("\n");
        System.out.println("----------- ANNOTATIONS --------------");
        System.out.println("- Annotation names are case sensitive.");
        System.out.println("- When declaring an annotation, any element without a default value is considered required.");
        System.out.println("- The default value of an annotation must be a non‐ null constant expression:\n");
        System.out.println("   public @interface BadAnnotation {\n" +
                "      String name() default new String(\"\"); // DOES NOT COMPILE\n" +
                "      String address() default \"\";\n" +
                "      String title() default null; // DOES NOT COMPILE\n" +
                "   }");
    }

}
