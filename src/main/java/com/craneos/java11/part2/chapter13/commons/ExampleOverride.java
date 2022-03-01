package com.craneos.java11.part2.chapter13.commons;

/**
 * Using these annotations is not required, but using them incorrectly is prohibited.
 */
interface Intelligence {
    int cunning();
}
class Canine implements Intelligence {
    @Override public int cunning() { return 500; }
    void howl() { System.out.print("Woof!"); }
}

class InvalidExampleOverride extends Canine {
    //@Override protected int cunning() { return 500; } // DOES NOT COMPILE
    //@Override public boolean playFetch() { return true; } // DOES NOT COMPILE
    //@Override void howl(int timeOfDay) {} // DOES NOT COMPILE
}

public class ExampleOverride extends Canine {
    @Override
    public int cunning() { return Integer.MAX_VALUE; }

    @Override void howl(){
        System.out.print("Howl!");
    }
}
