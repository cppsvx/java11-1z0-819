package com.craneos.java11.part1.chapter8.simple;

public class Animal extends Common {

    private String color;
    private int weight;

    public Animal(int weight) {
        System.out.println("Running Animal constructor");
        this.weight = weight;
        color = "brown";
    }
}
