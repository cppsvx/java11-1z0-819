package com.craneos.java11.part2.chapter12.interfaces;

interface Walk {
    public default int getSpeed() { return 5; }
}
interface Run {
    public default int getSpeed() { return 10; }
}
/*
public class MultipleInterface implements Walk, Run { // DOES NOT COMPILE. getSpeed NEEDS TO BE OVERRIDEN
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}*/
public class MultipleInterface implements Walk, Run {

    public int getSpeed() { return 10; }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new MultipleInterface().getSpeed());
        System.out.println(new MultipleInterface().getWalkSpeed());
    }
}