package com.craneos.java11.part1.chapter8.hiding;

class Dragon {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}
public class Panda extends Dragon {
    // DOES NOT COMPILE
    /*public void sneeze() {
        System.out.println("Panda sneezes quietly");
    }*/
    // DOES NOT COMPILE
    /*public static void hibernate() {
        System.out.println("Panda is going to sleep");
    }*/
    // DOES NOT COMPILE
    /*protected static void laugh() {
        System.out.println("Panda is laughing");
    }*/
}