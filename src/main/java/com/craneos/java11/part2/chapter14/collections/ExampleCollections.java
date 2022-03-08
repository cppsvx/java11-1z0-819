package com.craneos.java11.part2.chapter14.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class ExampleCollections {

    public static void main(String... xyz) {
        add();
        remove();
        removeWhileLooping();
        isEmptyAndSize();
        clear();
    }

    public static void add() {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false
    }

    public static void remove() {
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk,hawk]
        birds.add("hawk3"); // [hawk,hawk,hawk3]
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds); // [hawk,hawk3]
    }

    public static void removeWhileLooping() {
        try{
            Collection<String> birds = new ArrayList<>();
            birds.add("hawk");
            birds.add("hawk");
            birds.add("hawk");
            for (String bird : birds) // ConcurrentModificationException
                birds.remove(bird);
        } catch (Exception e){
            System.out.println("Error. You can't remove while looping: "+e.getStackTrace());
        }
    }

    public static void isEmptyAndSize() {
        Collection<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
    }

    public static void clear(){
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
        birds.clear(); // []
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0
    }

    public static void contains(){
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false
    }

    public static void removeIf(){
        Collection<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        // boolean removeIf(Predicate<? super E> filter)
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]

        //
        Collection<String> set = new HashSet<>();
        set.add("Wand");
        set.add("");
        // boolean removeIf(Predicate<? super E> filter)
        set.removeIf(String::isEmpty); // s -> s.isEmpty()
        System.out.println(set); // [Wand]
    }

    public static void forEach(){
        Collection<String> cats = Arrays.asList("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));
    }



}
