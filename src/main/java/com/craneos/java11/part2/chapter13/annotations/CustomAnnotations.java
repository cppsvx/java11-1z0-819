package com.craneos.java11.part2.chapter13.annotations;

@interface Example {
    int numberOfTestCases();    // IS MANDATORY
    int startHour() default 6;  // IS OPTIONAL
}

@Example(numberOfTestCases=3) class Cases {}
//@Example numberOfTestCases=3 class Tests {} //DOES NOT COMPILE

@Example(numberOfTestCases=3)
public class CustomAnnotations {
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
