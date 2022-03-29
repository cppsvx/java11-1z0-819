package com.craneos.java11.part2.chapter18.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleIncorrectUnlocks {

    public static void main(String[] args) throws Exception {
        testCaseIncorrectLock();
    }

    /**
     * Lock twice
     */
    private static void testCaseIncorrectLock(){
        System.out.println("----------------------------- testCaseComparingExample ------------------------");
        Lock lock = new ReentrantLock();
        if(lock.tryLock()) {
            try {
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        }

        new Thread(() -> System.out.print(lock.tryLock())).start();
    }
}
