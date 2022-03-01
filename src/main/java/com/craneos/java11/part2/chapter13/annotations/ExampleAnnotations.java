package com.craneos.java11.part2.chapter13.annotations;

@interface Swimmer {
    int armLength = 10;
    String stroke();
    String name();
    String favoriteStroke() default "Backstroke";
}

// DOES NOT COMPILE
//@Swimmer class Amphibian {}
// DOES NOT COMPILE
//@Swimmer(favoriteStroke="Breaststroke", name="Sally") class Tadpole {}
@Swimmer(stroke="FrogKick", name="Kermit") class Frog {}
// DOES NOT COMPILE
//@Swimmer(stroke="Butterfly", name="Kip", armLength=1) class Reptile {}
@Swimmer(stroke="", name="", favoriteStroke="") class Snake {}

public class ExampleAnnotations {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1() {
        System.out.println("\n");
        System.out.println("----------- ANNOTATIONS --------------");
        System.out.println("@interface Swimmer {\n" +
                "    int armLength = 10;\n" +
                "    String stroke();\n" +
                "    String name();\n" +
                "    String favoriteStroke() default \"Backstroke\";\n" +
                "}\n" +
                "\n" +
                "// DOES NOT COMPILE\n" +
                "//@Swimmer class Amphibian {}\n" +
                "// DOES NOT COMPILE\n" +
                "//@Swimmer(favoriteStroke=\"Breaststroke\", name=\"Sally\") class Tadpole {}\n" +
                "@Swimmer(stroke=\"FrogKick\", name=\"Kermit\") class Frog {}\n" +
                "// DOES NOT COMPILE\n" +
                "//@Swimmer(stroke=\"Butterfly\", name=\"Kip\", armLength=1) class Reptile {}\n" +
                "@Swimmer(stroke=\"\", name=\"\", favoriteStroke=\"\") class Snake {}");
    }
}
