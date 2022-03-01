package com.craneos.java11.part1.chapter8.polymorph;

class Primate {
    public boolean hasHair() {
        return true;
    }
}
interface HasTail {
    public abstract boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Primate primate = new Primate();
        System.out.println("primate --> "+primate.hasHair());

        //Lemur lemur = new Primate(); // DOES NOT COMPILE
        //Lemur lemur = new HasTail(); // DOES NOT COMPILE
        Lemur lemur = new Lemur();
        System.out.println("lemur --> "+lemur.age);
        //
        HasTail hasTail = lemur;
        System.out.println("HasTail(lemur) --> "+hasTail.isTailStriped());
        //
        Primate primateFromLemur = lemur;
        System.out.println("Primate(lemur) --> "+primateFromLemur.hasHair());
    }
}
