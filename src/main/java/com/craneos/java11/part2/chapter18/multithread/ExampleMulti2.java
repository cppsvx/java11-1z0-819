package com.craneos.java11.part2.chapter18.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleMulti2 {

    private static StringBuilder sb1 = new StringBuilder();
    private static StringBuilder sb2 = new StringBuilder();
    private int sheepCount = 0;

    public static void main(String[] args) throws Exception {
        testcase1();
        testcase2();
    }

    private static void testcase1(){
        System.out.println("----------------------------- testcase1 ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            ExampleMulti2 manager = new ExampleMulti2();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReportSync());
        } finally {
            if(service != null) service.shutdown();
        }
    }

    private synchronized void incrementAndReportSync() {
        sb1.append(sheepCount);
        System.out.println("thread 1 -->"+(++sheepCount)+" ");
        System.out.println("RESULT xxxxxx --------> "+sb2.toString());
    }

    private static void testcase2(){
        System.out.println("----------------------------- testcase2 ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            ExampleMulti2 manager = new ExampleMulti2();
                for(int i = 0; i < 10; i++)
                    service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }

    private void incrementAndReport() {
        synchronized (sb2){
            sb2.append(sheepCount);
            System.out.println("-->"+(++sheepCount)+" ");
            System.out.println("RESULT 2222222 --------> "+sb2.toString());
        }
    }

}
