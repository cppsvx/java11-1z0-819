package com.craneos.java11.part1.chapter9.abstracts;

/** abstract classes cannot be instantiated.
 */
abstract class Bear {
    abstract CharSequence chew();
    public Bear() {
        System.out.println(chew()); // Does this compile?
    }
}
public class Panda extends Bear {
    String chew() { return "yummy!"; }
    public static void main(String[] args) {
        new Panda();
    }
}