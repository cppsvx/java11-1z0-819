package com.craneos.java11.part2.chapter18.scheduling;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExampleScheduling {

    public static void main(String[] args){
        testcase1();
        testcase2();
        testcase3();
    }

    private static void testcase1(){
        System.out.println("\n----------------------------- testcase1 ------------------------");
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Runnable task2 = () -> System.out.println("Hello Zoo2");
        Callable<String> task3 = () -> "Monkey";
        ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = service.schedule(task2, 1, TimeUnit.MINUTES);
        ScheduledFuture<?> r3 = service.schedule(task3, 5, TimeUnit.SECONDS);
        try {
            System.out.println("starting!!!");
            String data = (String) r3.get();
            System.out.println("data: "+data);
            System.out.println("finishing!");
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testcase2(){
        System.out.println("\n----------------------------- testcase2 ------------------------");
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo At Fixed Rate ");
        ScheduledFuture<?> r1 = service.scheduleAtFixedRate(task1, 5, 3, TimeUnit.SECONDS);
    }

    private static void testcase3(){
        System.out.println("\n----------------------------- testcase3 ------------------------");
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> {
            System.out.println("Hello Zoo With Fixed Delay ");
        };
        ScheduledFuture<?> r1 = service.scheduleWithFixedDelay(task1, 5, 3, TimeUnit.SECONDS);
    }

}
