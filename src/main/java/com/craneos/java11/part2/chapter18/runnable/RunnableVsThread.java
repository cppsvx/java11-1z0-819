package com.craneos.java11.part2.chapter18.runnable;

public class RunnableVsThread implements Runnable {
    @Override public void run() { // Overrides method in Runnable
        for(int i = 0; i < 3; i++)
            System.out.println("Printing record: "+i);
    }
    public static void main(String[] args) {
        (new Thread(new RunnableVsThread())).start();
    }
}

class ReadInventoryThread extends Thread {
    @Override public void run() { // Overrides method in Thread
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new RunnableVsThread())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");
    }
}