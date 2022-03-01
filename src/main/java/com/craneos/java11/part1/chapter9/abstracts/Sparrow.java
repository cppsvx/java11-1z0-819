package com.craneos.java11.part1.chapter9.abstracts;

/** abstract and PRIVATE together DOES NOT COMPILE */
//abstract class Whale {
//    private abstract void sing(); // DOES NOT COMPILE
//}

/** abstract and FINAL together DOES NOT COMPILE */
//abstract final class Tortoise { // DOES NOT COMPILE
//    abstract final void walk(); // DOES NOT COMPILE
//}

abstract class Bird {
    public abstract String getName();
    public void printName() {
        System.out.print(getName());
    }
}
//public class Stork extends Bird {} // DOES NOT COMPILE
class Stork extends Bird {
    public String getName() { return "Stork!"; }
}

public class Sparrow extends Bird {
    public String getName() { return "Sparrow!"; }
    public static void main(String[] args) {
        new Sparrow().printName();
    }
}