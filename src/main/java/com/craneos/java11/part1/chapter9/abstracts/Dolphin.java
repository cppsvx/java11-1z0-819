package com.craneos.java11.part1.chapter9.abstracts;

import java.io.IOException;

abstract class Insect {
    public void chew() {};
}

abstract class Mammal {
    public void chew() {}
    //public int abstract howl(); // DOES NOT COMPILE
    //public abstract static void swim(); // DOES NOT COMPILE
    //public abstract final int howl11(); // DOES NOT COMPILE
    //private abstract int howl11(); // DOES NOT COMPILE
    public abstract int howl1();
    public abstract long howl2();
    public abstract String howl3();
    public abstract CharSequence howl3A();
    public abstract void howl4(int p1);
    public abstract void howl5(int p1, String st1);
    public abstract void howl6(int p1, String st1) throws IOException;
    public abstract void howl7(int p1, String st1) throws Exception;
    protected abstract void howl8(int p1, String st1) throws Exception;
}

abstract class Rhino extends Mammal {
    public int howl1(){return 1;};
}

class SubRhino extends Rhino {
    public long howl2() { return 1l;}
    public String howl3() { return "hi";}
    public String howl3A() { return "hi";}
    public void howl4(int p1) { }
    public void howl5(int p1, String st1){
        System.out.println("howl5");
    }
    public void howl6(int p1, String st1) throws IOException{
        System.out.println("howl6");
    }
    public void howl7(int p1, String st1) throws IOException{
        System.out.println("howl6");
    }
    public void howl8(int p1, String st1) throws Exception{
        System.out.println("howl6");
    }
    public static void main(String[] args) {
        new Panda();
    }
}

public class Dolphin extends Mammal {
    public int howl1() { return 1; }
    public long howl2() { return 1l;}
    public String howl3() { return "hi";}
    public String howl3A() { return "hi";}
    public void howl4(int p1) { }
    public void howl5(int p1, String st1){
        System.out.println("howl5");
    }
    public void howl6(int p1, String st1) throws IOException{
        System.out.println("howl6");
    }
    public void howl7(int p1, String st1) throws IOException{
        System.out.println("howl6");
    }
    public void howl8(int p1, String st1) throws Exception{
        System.out.println("howl6");
    }
    public static void main(String[] args) {
        new Panda();
    }
}