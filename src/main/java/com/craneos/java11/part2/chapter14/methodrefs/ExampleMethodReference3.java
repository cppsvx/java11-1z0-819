package com.craneos.java11.part2.chapter14.methodrefs;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class PenguinEmperor {
    public static Integer countBabies(PenguinEmperor... cuties)
    {
        return cuties.length;
    }
}

public class ExampleMethodReference3 {

    public static void main(String[] args){
        testCase1("Message to write");
    }

    public static void testCase1(String sound) {
        Supplier<Integer> methodRef1 = PenguinEmperor::countBabies;
        Supplier<Integer> lambda1 = () -> PenguinEmperor.countBabies();

        Function<PenguinEmperor, Integer> methodRef2 = PenguinEmperor::countBabies;
        Function<PenguinEmperor, Integer> lambda2 = (x) -> PenguinEmperor.countBabies(x);

        BiFunction<PenguinEmperor, PenguinEmperor, Integer> methodRef3 = PenguinEmperor::countBabies;
        BiFunction<PenguinEmperor, PenguinEmperor, Integer> lambda3 = (x, y) -> PenguinEmperor.countBabies(x, y);
    }
}