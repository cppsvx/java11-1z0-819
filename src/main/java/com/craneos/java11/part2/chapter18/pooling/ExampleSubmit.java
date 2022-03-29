package com.craneos.java11.part2.chapter18.pooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExampleSubmit {

    public static void main(String[] args) {
        ExecutorService service = null;
        Runnable task1 = () -> System.out.println("Printing zoo inventory");
        Runnable task2 = () -> {
            for(int i = 0; i < 3; i++)
                System.out.println("Printing record: "+i);};
        //
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            Future<?> future1 = service.submit(task1);
            Future<?> future2 = service.submit(task2);
            Future<?> future3 = service.submit(task1);
            while(!future3.isDone());
            if (future1.isDone()){
                System.out.println("future1 done");
            }
            if (future2.isDone()){
                System.out.println("future2 done");
            }
            if (future3.isDone()){
                System.out.println("future3 done");
            }
            System.out.println("end");
        } finally {
            if(service != null) service.shutdown();
        }
    }

}
