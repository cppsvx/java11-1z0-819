package com.craneos.java11.part2.chapter15.streams.misc;

import java.util.Optional;

public class ExampleOptional {

    public static void main(String[] args){
        Optional<Integer> optional = Optional.of(3);
        testOptional(optional);
        testChainOptional(optional);
        testOptionalMap();
    }

    public static void testOptional(Optional<Integer> optional){
        System.out.println("\n----------------------------- testOptional ------------------------");
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "tp" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    public static void testChainOptional(Optional<Integer> optional){
        System.out.println("\n----------------------------- testChainOptional ------------------------");
        optional.map(n -> "tp" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }

    public static void testOptionalMap(){
        System.out.println("\n----------------------------- testOptionalMap ------------------------");
        Optional<String> optional = Optional.of("aaaaaaa");
        Optional<Integer> result1 = optional.map(String::length);
        //Optional<Integer> result2 = optional.map(e -> calculator()); // DOES NOT COMPILE
        Optional<Integer> result3 = optional.flatMap(e -> calculator());
    }

    private static Optional<Integer> calculator(){
        Optional<Integer> number = Optional.of(55);
        return number;
    }

}
