package com.craneos.java11.part1.chapter2.types;

public class Underscore {

    int bMillion_a = 1000000;
    int bMillion_b = 1_000_000;
    int bMillion_c = 1_0_0_00;

    // for decimal values
    double tDouble1 = 1_000_000.0;
    double tDouble2 = 1_000_000.0_0;

    // int bMillion_d = 1_000_000_; // DOES NOT COMPILE
    // int bMillion_e = _1_000_000; // DOES NOT COMPILE
    // double tDouble3 = 1_000_000_.0; // DOES NOT COMPILE
    // double tDouble4 = 1_000_000._0; // DOES NOT COMPILE
    // tDouble5 = 1_000_000_f; // DOES NOT COMPILE
    // double tDouble6 = _1_000_000._0; // DOES NOT COMPILE

    // byte b8 = 0b_00000001;  // Cannot have underscore directly after 0b
    // char c8 = 0x_007F;  // Cannot have underscore directly after 0x
    // int i8 = 1000000_;  // Underscore cannot be at end of literal
    // long d8 = 1000000_L; // Underscore cannot be prior to suffix  (L/l,F/f,D/d)
    // float f8 = _1000.000000; // Underscore cannot be at start of literal
    // double l8 = 1.0000000_e10; // Underscore cannot prefix exponential in literal

}
