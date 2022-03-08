package com.craneos.java11.part2.chapter14.methodrefs;

@FunctionalInterface
interface MessageWriter {
    boolean write(String message);
}

class MessageHelper {
    public static void processMessage(String message, MessageWriter messageWriter) {
        // exercise patience
        boolean result = messageWriter.write(message);
        System.out.println("messageWriter.write(message) ---> returns --> "+result);
    }
}

public class ExampleMethodReference {

    public static void main(String[] args){
        testCase1("Message to write");
    }

    public static void testCase1(String sound) {
        MessageWriter learner = s -> {
            System.out.println(s);
            return true;
        };
        MessageHelper.processMessage(sound, learner);

        MessageWriter isNotNull = s -> s!=null;
        MessageHelper.processMessage(sound, isNotNull);

        MessageWriter isNull = s -> s==null;
        MessageHelper.processMessage(sound, isNull);
    }
}