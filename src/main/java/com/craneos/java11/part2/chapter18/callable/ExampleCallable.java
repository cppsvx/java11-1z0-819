package com.craneos.java11.part2.chapter18.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExampleCallable {
    public static void main(String[] args) throws Exception {
        testcase1();
        testcase2();
        testcase3();
    }

    private static void testcase1() throws ExecutionException, InterruptedException {
        System.out.println("\n----------------------------- testcase1 ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get()); // 41
        } finally {
            if(service != null) service.shutdown();
        }
    }

    private static void testcase2() throws InterruptedException {
        System.out.println("\n----------------------------- testcase2 ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // Add tasks to the thread executor
            Runnable task1 = () -> {
                for(int i = 0; i < 3; i++)
                    System.out.println("Printing record: "+i);};
            service.execute(task1);
        } finally {
            if(service != null) service.shutdown();
        }
        if(service != null) {
            service.awaitTermination(1, TimeUnit.MINUTES);
            // Check whether all tasks are finished
            if(service.isTerminated()) System.out.println("Finished!");
            else System.out.println("At least one task is still running");
        }
    }

    private static void testcase3() throws InterruptedException {
        System.out.println("\n----------------------------- testcase3 ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // Add tasks to the thread executor
            Runnable task1 = () -> {
                for(int i = 0; i < 90000000; i++);};
            service.execute(task1);
        } finally {
            if(service != null) service.shutdown();
        }
        if(service != null) {
            service.awaitTermination(1, TimeUnit.MICROSECONDS);
            // Check whether all tasks are finished
            if(service.isTerminated()) System.out.println("Finished!");
            else System.out.println("At least one task is still running");
        }
    }
}
