package com.craneos.java11.part1.chapter1.examples;

public class Comments {

    /* Multiple
     * line comment
     */
    public static void main(String[] args) {
        // single line comment
        out();
    }

    /**
     * Javadoc multiple-line comment
     * @author cppsvx
     */
    private static void out(){
        System.out.println("Hi! world!");
    }

    /*
     * //other comment
     */
    // single line comment
    /// single line comment
    //// single line comment
    private static void out2(){
        System.out.println("Hi! world!");
    }
}
