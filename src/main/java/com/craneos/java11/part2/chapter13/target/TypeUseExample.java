package com.craneos.java11.part2.chapter13.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.function.Predicate;

@Target(ElementType.TYPE_USE)
@interface Technical {}

public class TypeUseExample {

    class OutSrc extends @Technical TypeUseExample {}

    public void repair() {
        var repairSubclass = new @Technical TypeUseExample() {};
        var o = new @Technical TypeUseExample().new @Technical OutSrc();
        int remaining = (@Technical int)10.0;
    }

}