package com.craneos.java11.part1.chapter2.types;

public class Asignment {

    byte tMinByte = -128; byte tMaxByte = 127;
    short tMinShort = 32767; short tMaxShort = -32768;
    int tMinInt = -2147483648; int tMaxInt = 2147483647;
    int tMinInteger = Integer.MIN_VALUE; int tMaxInteger = Integer.MAX_VALUE;

    //int x = 1.0; // DOES NOT COMPILE
    //short y = 13232323; // DOES NOT COMPILE
    //int z = 9f; // DOES NOT COMPILE
    //long t = 123153512422; // DOES NOT COMPILE

}
