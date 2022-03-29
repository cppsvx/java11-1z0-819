package com.craneos.java11.part2.chapter18.collections;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * For the exam, remember that the invokeAll() method will wait
 * indefinitely until all tasks are complete, while the invokeAny() method
 * will wait indefinitely until at least one task completes.
 */
public class ExampleCollections {

    public static void main(String[] args) throws Exception {
        testcaseInvokeAll();
        testcaseInvokeAny();
    }

    private static void testcaseInvokeAll() throws ExecutionException, InterruptedException {
        System.out.println("\n----------------------------- testcaseInvokeAll ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // Add tasks to the thread executor
            System.out.println("begin");
            Callable<String> task1 = () -> "result1";
            Callable<String> task2 = () -> "result2";
            Callable<String> task3 = () -> "result3";
            List<Future<String>> list = service.invokeAll(List.of(task1, task2, task3));
            System.out.println("invoked");
            for (Future<String> future : list) {
                System.out.println("pre getting");
                System.out.println(future.get());
                System.out.println("post getting");
            }
            System.out.println("end");
        } finally {
            if(service != null) service.shutdown();
        }
    }

    private static void testcaseInvokeAny() throws ExecutionException, InterruptedException {
        System.out.println("\n----------------------------- testcaseInvokeAny ------------------------");
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // Add tasks to the thread executor
            System.out.println("begin");
            Callable<String> task1 = () -> "result1";
            Callable<String> task2 = () -> "result2";
            Callable<String> task3 = () -> "result3";
            String data = service.invokeAny(List.of(task1, task2, task3));
            System.out.println(data);
        } finally {
            if(service != null) service.shutdown();
        }
    }

}
