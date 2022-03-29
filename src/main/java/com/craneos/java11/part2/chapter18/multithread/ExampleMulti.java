package com.craneos.java11.part2.chapter18.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleMulti {

    private int sheepCount = 0;
    private AtomicInteger atomicSheepCount = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        testcase1();
        testcase2();
        testcase3();
    }

    private static void testcase1(){
        System.out.println("----------------------------- testcase1 ------------------------");
        System.out.println("Runtime.getRuntime().availableProcessors(): "+Runtime.getRuntime().availableProcessors());
    }

    private static void testcase2(){
        System.out.println("----------------------------- testcase2 ------------------------");
        System.out.println("++ | --  operators are NOT THREAD SAFE");
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            ExampleMulti manager = new ExampleMulti();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }

    private static void testcase3(){
        System.out.println("----------------------------- testcase3 ------------------------");
        System.out.println("++ | --  operators are NOT THREAD SAFE");
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            ExampleMulti manager = new ExampleMulti();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.atomicIncrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }

    private void incrementAndReport() {
        System.out.print((++sheepCount)+" ");
    }

    private void atomicIncrementAndReport() {
        System.out.print((atomicSheepCount.getAndAdd(1))+" ");
    }

}
