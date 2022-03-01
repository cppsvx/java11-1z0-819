package com.craneos.java11.part1.chapter9.casting;

interface Canine {}
class Dog implements Canine {}
class Wolf implements Canine {}

/**
 * The code compiles but throws a ClassCastException at runtime.
 */
public class InterfaceBadCasts {
    public static void main(String[] args) {
        Canine canine = new Wolf();
        //Object badDog = (String)canine; // DOES NOT COMPILE
        Canine badDog = (Dog)canine;
    }
}