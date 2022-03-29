package com.craneos.java11.part2.chapter18.pooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExampleSubmit2 {

    private static int counter = 0;

    public static void main(String[] unused) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for(long i = 0; i < 900920000; i++)
                    ExampleSubmit2.counter++;
            });
            result.get(1, TimeUnit.MICROSECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if(service != null) service.shutdown();
        }
    }

}
