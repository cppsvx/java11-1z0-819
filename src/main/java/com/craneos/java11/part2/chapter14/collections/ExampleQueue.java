package com.craneos.java11.part2.chapter14.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * LinkedList preserves the insertion order, PriorityQueue does not. So your iteration order changes, which makes
 * your implementation that uses PriorityQueue something other than BFS.
 */
public class ExampleQueue {

    public static void main(String... xyz) {
        testCaseQueueLinkedList();
        testCaseQueuePriorityQueue();
        testCaseQueueMethods();
    }

    public static void testCaseQueueLinkedList() {
        System.out.println("\n----------------- testCaseQueueLinkedList ----------------");
        Queue<String> list = new LinkedList();
        list.add("hi");
        list.add("Sparrow");
        list.add("adventure");
        list.add("traveling");
        //
        for(String word:list){
            System.out.println(word);
        }
    }

    public static void testCaseQueuePriorityQueue() {
        System.out.println("\n----------------- testCaseQueuePriorityQueue ----------------");
        Queue<String> list = new PriorityQueue<>();
        list.add("hi");
        list.add("Sparrow");
        list.add("adventure");
        list.add("traveling");
        //
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            String word = iter.next();
            System.out.println(word);
        }
    }

    // Add:
    //      add() - Adds an element to the back of the queue and returns true or throws an exception
    //      offer() - Adds an element to the back of the queue and returns whether successful
    // Get:
    //      poll() - Removes and returns next element or returns null if empty queue
    //      peek() - Returns next element or returns null if empty queue
    private static void testCaseQueueMethods(){
        System.out.println("\n----------------- testCaseQueueMethods ----------------");
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.peek()); // 10
        System.out.println(queue.peek()); // 10
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null
        System.out.println(queue.peek()); // null
    }

}
