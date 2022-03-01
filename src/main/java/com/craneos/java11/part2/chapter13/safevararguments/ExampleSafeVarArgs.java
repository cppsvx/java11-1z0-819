package com.craneos.java11.part2.chapter13.safevararguments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This code compiles, although it generates two compiler warnings. Both are related to type safety.
public class ExampleSafeVarArgs {

    //@SafeVarargs
    //public static void eat(int meal) {} // DOES NOT COMPILE

    //@SafeVarargs
    //protected void drink(String... cup) {} // DOES NOT COMPILE

    @SafeVarargs
    final protected void drink(String... cup) {} // DOES NOT COMPILE

    //@SafeVarargs void chew(boolean... food) {} // DOES NOT COMPILE
    @SafeVarargs static void chew(boolean... food) {} // DOES NOT COMPILE

    @SafeVarargs
    final int thisIsUnsafe(List<Integer>... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0); // ClassCastException at runtime
    }

    public static void main(String[] a) {
        var carrot = new ArrayList<Integer>();
        new ExampleSafeVarArgs().thisIsUnsafe(carrot);
    }
}
