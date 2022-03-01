package com.craneos.java11.part1.chapter2.scope;

public class Scope {

    static String name = "UNKNOWN";  // Class Variable
    String instanceName = "UNKNOWN"; // Instance Variable;
    String age = "25";  // Instance Variable initialized;

    public static void main(String[] args) {
        testCase1(true, 5);
    }

    private static void testCase1(boolean hungry, int amountOfFood){
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}
