package com.craneos.java11.part1.chapter9.abstracts;

public abstract class Turtle {
    /** because it is marked abstract but does not end with as semicolon (;) */
    //public abstract long eat() // DOES NOT COMPILE

    /** DOES NOT COMPILE because they are marked abstract, but they provide an implementation block enclosed in braces ({}).*/
    //public abstract void swim() {}; // DOES NOT COMPILE

    /** DOES NOT COMPILE because they are marked abstract, but they provide an implementation block enclosed in braces ({}).*/
    /*public abstract int getAge() { // DOES NOT COMPILE
        return 10;
    }*/

    /** DOES NOT COMPILE because it is missing parentheses, (), for method arguments.*/
    //public void sleep; // DOES NOT COMPILE

    /** DOES NOT COMPILE because it is not marked abstract and therefore must provide a body enclosed in braces. */
    //public void goInShell(); // DOES NOT COMPILE

    public abstract int getAge();
}