package com.craneos.java11.part2.chapter18.pooling;

public class ExampleBasic {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for(int i = 0; i < 500; i++) ExampleBasic.counter++;
        }).start();
        while(ExampleBasic.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 SECOND
        }
        System.out.println("Reached!");
    }
}
