package com.craneos.java11.part1.chapter10.exceptions;

class CanNotHopException extends Exception { }

class Hopper {
    public void hop() { }
    public void hop2() throws CanNotHopException { }
    public void hop3() throws CanNotHopException { }
    public void hop4() throws CanNotHopException { }
    public void hop5() throws Exception { }
    public void hop6() { }
}

class Bunny extends Hopper {
    //public void hop() throws CanNotHopException { } // DOES NOT COMPILE
    public void hop2() throws CanNotHopException { }
    public void hop3(){ }
    //public void hop4() throws Exception { } // DOES NOT COMPILE
    public void hop5() throws CanNotHopException { }
    public void hop6() throws IllegalStateException { }
}

public class ExampleOverride {

    public static void main(String... xyz) {
        System.out.println("ExampleOverride");
    }

}
