package com.craneos.java11.part2.chapter16.exceptions;

public class CustomException2 extends Exception {

    public CustomException2() {
        super(); // Optional, compiler will insert automatically
    }

    public CustomException2(Exception e) {
        super(e);
    }

    public CustomException2(String message) {
        super(message);
    }
}