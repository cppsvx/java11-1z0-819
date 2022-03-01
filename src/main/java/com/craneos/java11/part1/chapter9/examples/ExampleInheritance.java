package com.craneos.java11.part1.chapter9.examples;

interface HasTail {
    public int getTailLength();
}

interface HasWhiskers {
    public int getNumberOfWhiskers();
}

abstract class HarborSeal implements HasTail, HasWhiskers { }

public class ExampleInheritance extends HarborSeal {
    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }

}