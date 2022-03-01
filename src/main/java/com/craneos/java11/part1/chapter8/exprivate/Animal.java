package com.craneos.java11.part1.chapter8.exprivate;

public class Animal extends Common {

    private String color;
    private int weight;

    private Animal() {
        System.out.println("Running Animal constructor");
        this.weight = 32;
        color = "brown";
    }

    static class Dolphin extends Animal {

        private String color;
        private int weight;

        public Dolphin(int weight) {
            System.out.println("Running Animal constructor");
            this.weight = weight;
            color = "brown";
        }
    }
}