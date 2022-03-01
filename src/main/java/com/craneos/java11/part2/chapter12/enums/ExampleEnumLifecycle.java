package com.craneos.java11.part2.chapter12.enums;

public class ExampleEnumLifecycle {

    public enum Season {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SPRING {
            public String getHours() { return "9am-5pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        FALL {
            public String getHours() { return "9am-5pm"; }
        };
        public abstract String getHours();
    }

    public enum Season2 {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        SPRING, FALL;
        public String getHours() { return "9am-5pm"; }
    }

    public enum OnlyOne {
        ONCE(true);
        private OnlyOne(boolean b) {
            System.out.print("constructing,");
        }
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    private static void testCase1(){
        System.out.println("\n----------- ENUM LIFECYCLE --------------");
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE; // prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
        System.out.print("end");
    }

    private static void testCase2(){
        System.out.println("\n----------- ENUM WITH ABSTRACT METHOD --------------");
        String hours = Season.FALL.getHours();
        System.out.print("hours = "+hours);
    }

    private static void testCase3(){
        System.out.println("\n----------- ENUM WITH DEFAULT METHOD --------------");
        String hours = Season2.FALL.getHours();
        System.out.print("hours = "+hours);
    }

}
