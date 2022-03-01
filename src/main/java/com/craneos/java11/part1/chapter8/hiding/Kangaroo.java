package com.craneos.java11.part1.chapter8.hiding;

class Marsupial {
    protected int age = 2;
    public static boolean isBiped() {
        System.out.println("Marsupial.isBiped");
        return false;
    }
    public static void eat() {
        System.out.println("Marsupial is eating");
    }
}

public class Kangaroo extends Marsupial {
    protected int age = 6;
    public static boolean isBiped() {
        System.out.println("Kangaroo.isBiped is hiding ---> Marsupial.isBiped");
        return true;
    }
    public static void eat() {
        System.out.println("Kangaroo is eating");
    }
    public static void main(String[] args) {
        eat();
        Kangaroo.eat();
        Kangaroo joey = new Kangaroo();
        Marsupial moey = joey;
        System.out.println("Kangaroo joey.isBiped()---> "+joey.isBiped());
        System.out.println("Marsupial moey.isBiped()---> "+moey.isBiped());
        System.out.println(joey.age);
        System.out.println(moey.age);
    }
}