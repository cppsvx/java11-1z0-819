package com.craneos.java11.part1.chapter2.types;

public class PrimitiveTypesInvalid {
    // byte b8 = 0b_00000001;  // Cannot have underscore directly after 0b
    // char c8 = 0x_007F;  // Cannot have underscore directly after 0x
    // int i8 = 1000000_;  // Underscore cannot be at end of literal
    // long d8 = 1000000_L; // Underscore cannot be prior to suffix  (L/l,F/f,D/d)
    // float f8 = _1000.000000; // Underscore cannot be at start of literal
    // double l8 = 1.0000000_e10; // Underscore cannot prefix exponential in literal
    //
    // byte b9 = null;
    // char c9 = null;
    // short s9 = null;
    // int i9 = null;
    // long l9 = null;
    // float f9 = null;
    // double d9 = null;
    //
    // boolean aBoolean = 0;
    // boolean bBoolean = null;
}
