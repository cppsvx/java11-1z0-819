package com.craneos.java11.part2.chapter18.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExampleCyclicBarrier {

    public static void main(String[] args) throws Exception {
        testCycleBarrier();
        testCycleBarrierWithDeadlock();
    }

    private static void testCycleBarrier(){
        System.out.println("----------------------------- testCycleBarrier ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(6);
            var manager = new ExampleCyclicBarrier();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask(c1, c2));
            while(((ThreadPoolExecutor) service).getCompletedTaskCount()<4);
        } finally {
            if (service != null) service.shutdown();
        }
    }

    private static void testCycleBarrierWithDeadlock(){
        System.out.println("----------------------------- testCycleBarrierWithDeadlock ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(2);
            var manager = new ExampleCyclicBarrier();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask(c1, c2));

        } finally {
            if (service != null) service.shutdown();
        }
    }

    private void removeLions() {System.out.println("Removing lions");}
    private void cleanPen() {System.out.println("Cleaning the pen");}
    private void addLions() {System.out.println("Adding lions");}

    public void performTask(CyclicBarrier c1, CyclicBarrier c2){
        try {
            removeLions();
            c1.await();
            cleanPen();
            c2.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle checked exceptions here
            e.printStackTrace();
        }
    }

}
