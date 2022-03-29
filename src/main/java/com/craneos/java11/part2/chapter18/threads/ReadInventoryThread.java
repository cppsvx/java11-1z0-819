package com.craneos.java11.part2.chapter18.threads;

public class ReadInventoryThread extends Thread {
    @Override public void run() { // Overrides method in Thread
        System.out.println("Printing zoo inventory");
    }
    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}