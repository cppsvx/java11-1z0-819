package com.craneos.java11.part1.chapter9.examples;

abstract class Husky {
    abstract void play(); //default access by default
}
interface Poodle {
    public void play(); // public access by default
}

class Webby extends Husky {
    void play() {}
}

class Georgette implements Poodle {
    //void play() {} //DOES NOT COMPILE. Default reduce visibility
    public void play() {}
}

public class ExampleDefaultModifiers {
}
