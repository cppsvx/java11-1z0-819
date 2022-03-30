package com.craneos.java11.part2.chapter18.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

/**
 * For the exam, remember that the invokeAll() method will wait
 * indefinitely until all tasks are complete, while the invokeAny() method
 * will wait indefinitely until at least one task completes.
 */
public class ExampleConcurrentCollectionsError {

    public static void main(String[] args) throws Exception {
        testSynchronizedHashMap();
    }

    private static void testSynchronizedHashMap(){
        System.out.println("\n----------------------------- testSynchronizedHashMap ------------------------");
        var foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        var synFoodData = Collections.synchronizedMap(foodData);
        // Throws error:
        // Exception in thread "main" java.util.ConcurrentModificationException
        for(String key: synFoodData.keySet())
            synFoodData.remove(key);
    }

}
