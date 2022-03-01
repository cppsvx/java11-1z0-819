package com.craneos.java11.part1.chapter7.methods;

public class Overloading {

    public static void main(String[] args) {
        fly(1);
        fly((short)2);
        fly();
        fly(3, (short)3);
        try {
            fly((short)3, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fly(new int[]{3,4});
        fly(new Integer[]{3,4});
    }

    //public int fly(int numMiles) {return 0;} // DOES NOT COMPILE. TWO METHODS WITH SAME NAME AND PARAMETERS
    public static void fly(int numMiles) {}
    public static void fly(short numFeet) {}
    public static boolean fly() { return false; }
    static void fly(int numMiles, short numFeet) {}
    public static void fly(short numFeet, int numMiles) throws Exception {}
    public static void fly(int[] ints) {}
    public static void fly(Integer[] integers) {}

}
