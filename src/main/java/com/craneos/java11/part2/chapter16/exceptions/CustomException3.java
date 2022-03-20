package com.craneos.java11.part2.chapter16.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomException3 {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    /**
     * Since FileNotFoundException is a subclass of IOException, listing both
     * in a multi‐ catch expression is redundant, resulting in a compilation error.
     * @throws CannotSwimException
     */
    public static void test1(){
        /*
        try {
            throw new IOException();
        } catch (IOException | FileNotFoundException e) {} // DOES NOT COMPILE
         */
    }

    public static void test2(){
        /*
        try {
            throw new IOException();
        } catch (IOException e) {
        } catch (FileNotFoundException e) {} // DOES NOT COMPILE
        */
    }

    public static void test3(){
        try {
            throw new IOException();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {}
    }
}
