package com.craneos.java11.part1.chapter9.interfaces;

/** When working with class members, omitting the access modifier indicates:
 * - default (package-private access)
 * When working with interface members, though, the lack of access modifier
 * - public (public access always)
 */
interface Crawl {
    //String distance; // DOES NOT COMPILE
    String distance = "3M";
    //private int MAXIMUM_DEPTH = 100;  // DOES NOT COMPILE
    int MAXIMUM_DEPTH = 100;  // DOES NOT COMPILE
    //protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE. Variables cannot be marked abstract.
    boolean UNDERWATER = false;
    //private void dig(int depth); // DOES NOT COMPILE
    //protected abstract double depth(); // DOES NOT COMPILE
    //public final void surface(); // DOES NOT COMPILE
}

interface Soar {
    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = true;
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
    //protected double dive(); // DOES NOT COMPILE
    //private double dive(); // DOES NOT COMPILE
}

interface Nocturnal {
    public int hunt();
}

interface CanFly {
    public void flap();
    public static void move(){
        System.out.println("moving");
    };
    private static void jump(){
        System.out.println("jumping");
    };
    private void run(){
        System.out.println("running");
    };
}

interface HasBigEyes extends Nocturnal, CanFly {}

public class Owl implements Nocturnal, CanFly {
    public int hunt() { return 5; }
    public void flap() {
        System.out.println("Flap!");
    }
}