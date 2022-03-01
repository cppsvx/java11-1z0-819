package com.craneos.java11.part1.chapter6.simple;

import java.util.*;

public class SimpleLambda {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    private static void testCase1(){
        // list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        //print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());
        print(animals, (Animal a) -> { return a.canHop();});
        print(animals, a -> a.canSwim());
        print(animals, (Animal a) -> { return a.canSwim();});
        //print(animals, (Animal a) -> { return a.canSwim()}); // DOES NOT COMPILE. SEMICOLON MANDATORY
        //print(animals, (Animal a) -> { a.canSwim();}); // DOES NOT COMPILE. RETURN MANDATORY
        //print(animals, (Animal a) -> return a.canSwim();); // DOES NOT COMPILE. LLAVE MANDATORY
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            // the general check
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }

    private static void testCase2(){
    }

}