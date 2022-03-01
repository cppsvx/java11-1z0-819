package com.craneos.java11.part2.chapter12.enums;

public class ExampleEnum {

    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public enum SeasonWithConstructor {
        WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
        private final String expectedVisitors;
        private SeasonWithConstructor(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }
        public void printExpectedVisitors() {
            System.out.println("Season.SUMMER.printExpectedVisitors()="+expectedVisitors);
        }
    }

    public static void main(String... xyz) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    private static void testCase1(){
        System.out.println("\n----------- ENUM 1 --------------");
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); // SUMMER
        System.out.println("s == Season.SUMMER"+(s == Season.SUMMER)); // true
        System.out.println("Season.WINTER.ordinal()="+(Season.WINTER.ordinal() == 0)); // true
        System.out.println("Season.SPRING.ordinal()="+(Season.SPRING.ordinal() == 1)); // true
        System.out.println("Season.SUMMER.ordinal()="+(Season.SUMMER.ordinal() == 2)); // true
        System.out.println("Season.FALL.ordinal()="+(Season.FALL.ordinal() == 3)); // true
    }

    private static void testCase2(){
        System.out.println("\n----------- ENUM WITH CONSTRUCTORS --------------");
        SeasonWithConstructor.SUMMER.printExpectedVisitors();
    }

    private static void testCase3(){
        System.out.println("\n----------- ENUM SWITCH --------------");
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            /*case Season.FALL: // DOES NOT COMPILE
                System.out.println("Rake some leaves!");
                break;*/
            /*case 0: // DOES NOT COMPILE
                System.out.println("Get out the sled!");
                break;*/
            default:
                System.out.println("Is it summer yet?");
        }
    }

    private static void testCase4(){
        System.out.println("\n----------- ENUM VALUES--------------");
        System.out.println("Season values:"); // true
        for(Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        //if (Season.SUMMER == 2) {} // DOES NOT COMPILE
        Season summer = Season.valueOf("SUMMER"); // SUMMER
        System.out.println("\nSeason.valueOf(\"SUMMER\")="+summer);
        Season t = Season.valueOf("summer"); // Throws an exception at runtime
    }

}
