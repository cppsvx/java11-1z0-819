package com.craneos.java11.part2.chapter18.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleLocks {

    private static StringBuilder sb1 = new StringBuilder();
    private static StringBuilder sb2 = new StringBuilder();
    private int sheepCount = 0;

    public static void main(String[] args) throws Exception {
        testCaseComparingExample();
        testCaseTry();
        testcase2();
    }

    private static void testCaseComparingExample(){
        System.out.println("----------------------------- testCaseComparingExample ------------------------");
        // Implementation #1 with a synchronized block
        Object object = new Object();
        synchronized(object) { // Protected code
        }
        // Implementation #2 with a Lock
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            // Protected code
        } finally {
            lock.unlock();
        }
    }

    private static void testCaseTry(){
        System.out.println("----------------------------- testCaseTry ------------------------");
        Lock lock = new ReentrantLock();
        new Thread(() -> printMessage(lock)).start();
        if(lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    public static void printMessage(Lock lock) {
        try {
            lock.lock();
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    private static void testcase2(){
        System.out.println("----------------------------- testcase2 ------------------------");
        Lock lock = new ReentrantLock();
        try {
            System.out.println("// Error. Trying to unlock when there is no lock");
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }
}
