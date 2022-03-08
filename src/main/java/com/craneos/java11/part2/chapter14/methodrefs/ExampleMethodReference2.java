package com.craneos.java11.part2.chapter14.methodrefs;

@FunctionalInterface
interface MessageWriter2 { ;
    void write(String message);
}

class MessageHelper2 {
    public static void processMessage(String message, MessageWriter2 messageWriter2) {
        // exercise patience
        messageWriter2.write(message);
    }
}

public class ExampleMethodReference2 {

    public static void main(String[] args){
        testCase1("Message to write");
    }

    public static void testCase1(String sound) {
        MessageWriter2 learner = System.out::println;
        MessageHelper2.processMessage(sound, learner);
    }
}