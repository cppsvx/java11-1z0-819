package com.craneos.java11.part2.chapter18.runnable;

public class ExampleRunnable implements Runnable {

    private double[] scores;
    public ExampleRunnable(double[] scores) {
        this.scores = scores;
    }

    public void run() {
        // Define work here
    }

    public static void main(String[] args){
        testCase1();
    }

    private static void testCase1(){
        Runnable sloth = () -> System.out.println("Hello World");
        Runnable snake = () -> {int i=10; i++;};
        Runnable beaver = () -> {return;};
        Runnable coyote = () -> {};
        //Runnable capybara = () -> ""; // DOES NOT COMPILE
        //Runnable Hippopotamus = () -> 5; // DOES NOT COMPILE
        //Runnable emu = () -> {return new Object();}; // DOES NOT COMPILE
    }

}
