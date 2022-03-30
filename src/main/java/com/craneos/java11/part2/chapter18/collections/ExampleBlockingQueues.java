package com.craneos.java11.part2.chapter18.collections;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ExampleBlockingQueues {

    public static void main(String... xyz) {
        testLinkedBlockingQueue();
        testLinkedBlockingQueueBlocked();
    }

    private static void testLinkedBlockingQueue() {
        System.out.println("\n----------------------------- testLinkedBlockingQueue ------------------------");
        try {
            var blockingQueue = new LinkedBlockingQueue<Integer>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            // Handle interruption
        }
    }

    private static void testLinkedBlockingQueueBlocked() {
        System.out.println("\n----------------------------- testLinkedBlockingQueueBlocked ------------------------");
        ExecutorService service = null;
        try {
            var blockingQueue = new LinkedBlockingQueue<Integer>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);

            Runnable task1 = () -> {
                try {
                    for (int i=0; i<9; i++){
                        blockingQueue.offer(i+10, 4, TimeUnit.MILLISECONDS);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };;
            service = Executors.newSingleThreadExecutor();
            service.submit(task1);
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
            System.out.println(blockingQueue.poll());
            service.awaitTermination(1, TimeUnit.MILLISECONDS);
            blockingQueue.stream().forEach(i->System.out.println("queue -> "+i));
            System.out.println("queue -> "+blockingQueue.poll());
        } catch (InterruptedException e) {
            // Handle interruption
        } finally {
            service.shutdown();
        }
    }
}
