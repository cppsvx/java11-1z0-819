package com.craneos.java11.part2.chapter13.functional;

@FunctionalInterface interface Intelligence {
    abstract int cunning();
}

// DOES NOT COMPILE. @FunctionalInterface only for interfaces
/*@FunctionalInterface abstract class Reptile {
    abstract String getName();
}*/

// DOES NOT COMPILE. it does not contain any abstract methods
//@FunctionalInterface interface Slimy {}

@FunctionalInterface interface Scaley {
    boolean isSnake();
}

// DOES NOT COMPILE. it contains two abstract methods, one of which it inherits from Scaley.
/*@FunctionalInterface interface Rough extends Scaley {
    void checkType();
}*/

// COMPILE. Finally, the Smooth interface contains two abstract methods. Equals inherited from Object
@FunctionalInterface interface Smooth extends Scaley {
    boolean equals(Object unused);
}

public class ExampleFunctionalInterfaces implements Smooth {
    @Override
    public boolean isSnake() {
        return false;
    }
}