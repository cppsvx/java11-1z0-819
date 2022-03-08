package com.craneos.java11.part2.chapter14.methodrefs;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Penguin {
    public static Integer countBabies(Penguin... cuties)
    {
        return cuties.length;
    }
}

public class ExampleMultiple2 {

    public static void main(String[] args){
        testCase1();
    }

    private static void testCase1(){
        Supplier<Integer> methodRef1 = Penguin::countBabies;
        Supplier<Integer> lambda1 = () -> Penguin.countBabies();
        Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
        Function<Penguin, Integer> lambda2 = (x) -> Penguin.countBabies(x);
        BiFunction<Penguin, Penguin, Integer> methodRef3 = Penguin::countBabies;
        BiFunction<Penguin, Penguin, Integer> lambda3 = (x, y) -> Penguin.countBabies(x, y);
    }

}
