package com.craneos.java11.part2.chapter12.interfaces;

interface IsWarmBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
    //public default void eatMeat(); // DOES NOT COMPILE. SHOULD HAVE A BODY
    /*public int getRequiredFoodAmount() { // DOES NOT COMPILE. IT IS ABSTRACT, CAN NOT HAVE A BODY
        return 13;
    }*/
}

public class DefaultInterface implements IsWarmBlooded {
    @Override
    public boolean hasScales() {
        return false;
    }

    public static void main(String... xyz) {
        testCase1();
    }

    private static void testCase1(){
        // System.out.println("Calling default interface: "+getTemperature()); // DOES NOT COMPILE. MUST BE STATIC
    }

}
