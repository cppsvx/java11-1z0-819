package com.craneos.java11.part2.chapter12.functional.lambdas;

import java.util.ArrayList;
import java.util.List;

interface Predicate<T> {
    boolean test(T t);
}

public class LambdaFunctionalInterface {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1() {
        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        //
        System.out.println("\n");
        System.out.println("----------- LAMBDA FUNCTIONAL INTERFACE --------------");
        System.out.println("Any functional interface can be implemented as a lambda expression:\n");
        System.out.println("    interface Predicate<T> {\n" +
                "        boolean test(T t);\n" +
                "    }");
        System.out.println("    ...");
        System.out.println("    var animals = new ArrayList<Animal>();");
        System.out.println("    ...");
        System.out.println("    print(animals, a -> a.canHop());    |    print(animals, a -> a.canHop());");
        System.out.println("    ...");
        System.out.println("    private static void print(List<Animal> animals, Predicate<Animal> checker) {\n" +
                "        for (Animal animal : animals) {\n" +
                "            if (checker.test(animal))\n" +
                "                System.out.print(animal + \" \");\n" +
                "        }\n" +
                "    }");
        // Pass lambda that does check
        print(animals, a -> a.canHop());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print("\nChecking animal "+animal);
        }
    }
}
