package com.craneos.java11.part2.chapter12.classes;

public class AnonymousClass {

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { return 3; }
        }; // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }

    interface SaleTodayOnly2 {
        int dollarsOff();
    }

    public int admission2(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() { return 3; }
        }; // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        System.out.println("----------- ENUM WITH CONSTRUCTORS --------------");
        System.out.println("Anonymous class example. Check source code.");
    }

}
