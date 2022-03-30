package com.craneos.java11.part2.chapter18.collections;

import java.util.ArrayList;
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
public class ExampleConcurrentCollections {

    public static void main(String[] args) throws Exception {
        testHashMap();
        testConcurrentHashMap();
        testConcurrentLinkedQueue();
        testSkipList();
        testCopyOnWrite();
        testCopyOnList();
        testRemoveWhileLooping();
    }

    private static void testHashMap(){
        System.out.println("\n----------------------------- testHashMap ------------------------");
        var foodData = new HashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for(String key: foodData.keySet());
            //foodData.remove(key);   // Exception in thread "main" java.util.ConcurrentModificationException
        System.out.println("Content of foodData: "+foodData);
    }

    private static void testConcurrentHashMap() {
        System.out.println("\n----------------------------- testConcurrentHashMap ------------------------");
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for(String key: foodData.keySet())
            foodData.remove(key);
        System.out.println("Content of foodData: "+foodData);
    }

    private static void testConcurrentLinkedQueue() {
        System.out.println("\n----------------------------- testConcurrentLinkedQueue 1 ------------------------");
        Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant")); // 10

        System.out.println("\n----------------------------- testConcurrentLinkedQueue 2 ------------------------");
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(31);
        System.out.println(queue.peek()); // 31
        System.out.println(queue.poll()); // 31
        System.out.println(queue.peek()); // null
    }

    private static void testSkipList(){
        System.out.println("\n----------------------------- testSkipList ------------------------");
        Set<String> gardenAnimals = new ConcurrentSkipListSet<>(); // TreeSet
        gardenAnimals.add("rabbit");
        gardenAnimals.add("gopher");
        System.out.println(gardenAnimals.stream().collect(Collectors.joining(","))); // gopher,rabbit

        Map<String, String> rainForestAnimalDiet = new ConcurrentSkipListMap<>(); // TreeMap
        rainForestAnimalDiet.put("koala", "bamboo");
        rainForestAnimalDiet.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + "-" + e.getValue())); // koala-bamboo
    }

    private static void testCopyOnWrite(){
        System.out.println("\n----------------------------- testCopyOnWrite ------------------------");
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4,3,42));
        for(var n: favNumbers) {
            System.out.print(n + " ");
            favNumbers.add(9);
        }
        System.out.println();
        System.out.println("Size: " + favNumbers.size());
    }

    private static void testCopyOnList(){
        System.out.println("\n----------------------------- testCopyOnList ------------------------");
        Set<Character> favLetters = new CopyOnWriteArraySet<>(List.of('a','t'));
        for(char c: favLetters) {
            System.out.print(c+" ");
            favLetters.add('s');
        }
        System.out.println();
        System.out.println("Size: "+ favLetters.size());
    }

    public static void testRemoveWhileLooping() {
        System.out.println("\n----------------------------- testRemoveWhileLooping 1 ------------------------");
        try{
            List<String> birds = new CopyOnWriteArrayList<>();
            birds.add("hawk");
            birds.add("hawk");
            birds.add("hawk");
            for (String bird : birds)
                birds.remove(bird);
            System.out.print(birds.size()); // 0
        } catch (Exception e){
            System.out.println("Error. You can't remove while looping: "+e.getStackTrace());
        }

        System.out.println("\n----------------------------- testRemoveWhileLooping 2 ------------------------");
        try{
            List<String> birds = new ArrayList<>();
            var iterator = birds.iterator();
            while(iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            System.out.print(birds.size()); // 0
        } catch (Exception e){
            System.out.println("Error. You can't remove while looping: "+e.getStackTrace());
        }
    }

}
