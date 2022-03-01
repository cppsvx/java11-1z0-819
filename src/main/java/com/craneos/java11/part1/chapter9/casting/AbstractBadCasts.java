package com.craneos.java11.part1.chapter9.casting;

/**
 * The code compiles but throws a ClassCastException at runtime.
 */
public class AbstractBadCasts {
    public static void main(String[] args) {
        Canine canine = new Wolf();
        //Object badDog = (String)canine; // DOES NOT COMPILE
        Canine badDog = (Dog)canine;
    }
}