package com.craneos.java11.part1.chapter3.operators;

public class InstanceOfOperator {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammal leon = new Mammal();
        Fish moonfish = new Fish();

        if (animal instanceof Animal){
            System.out.println("animal is instance of Animal");
        }
        if (leon instanceof Animal){
            System.out.println("leon is instance of Animal");
        }
        if (leon instanceof Mammal){
            System.out.println("leon is instance of Mammal");
        }
        if (leon instanceof Brain){
            System.out.println("leon is instance of Brain");
        }
        if (moonfish instanceof Animal){
            System.out.println("moonfish is instance of Animal");
        }
        if (!(moonfish instanceof Brain)){
            System.out.println("moonfish is NOT instance of Brain");
        }
    }
}

interface Brain{
    void see();
    void feel();
    void eat();
}

class Animal{
    private boolean isAlive = false;
    public void born(){
        isAlive = true;
    }
    public void die(){
        isAlive = false;
    }
}

class Mammal extends Animal implements Brain{
    private int eyes = 2;
    private void run(){
        System.out.println("Mammal is running");
    }

    @Override
    public void see() {
        System.out.println("Mammal is seeing");
    }

    @Override
    public void feel() {
        System.out.println("Mammal is feeling");
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }
}

class Fish extends Animal{
    private int eyes = 2;
    private void swim(){
        System.out.println("Fish is swimming");
    }
}

