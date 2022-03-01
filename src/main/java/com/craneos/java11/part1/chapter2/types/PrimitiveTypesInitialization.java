package com.craneos.java11.part1.chapter2.types;

public class PrimitiveTypesInitialization {

    // Declaration of local variables, local to the main method
    boolean myGlobalBoolean;
    byte myGlobalByte;
    char myGlobalFirstChar, myGlobalSecondChar;
    short myGlobalShort;
    long myGlobalLong;
    float myGlobalFloat;
    double myGlobalFirstDouble, myGlobalSecondDouble;
    float notUsed; //Not used, no error

    public static void main(String[] args) {

        /* Error, this vars has not been initialized
        System.out.println("myGlobalBoolean = " + myGlobalBoolean);
        System.out.println("myGlobalByte = " + myGlobalByte);
        System.out.println("myGlobalFirstChar = " + myGlobalFirstChar);
        System.out.println("myGlobalSecondChar = " + myGlobalSecondChar);
        System.out.println("myGlobalShort = " + myGlobalShort);
        System.out.println("myGlobalLong = " + myGlobalLong);
        System.out.println("myGlobalFirstDouble = " + myGlobalFirstDouble);
        System.out.println("myGlobalSecondDouble = " + myGlobalSecondDouble);
        */

        // Declaration of local variables, local to the main method
        boolean myBoolean;
        byte myByte;
        char myFirstChar, mySecondChar;
        short myShort;
        long myLong;
        float myFloat;
        double myFirstDouble, mySecondDouble;

        /* Error, this vars has not been initialized
        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myByte = " + myByte);
        System.out.println("myFirstChar = " + myFirstChar);
        System.out.println("mySecondChar = " + mySecondChar);
        System.out.println("myShort = " + myShort);
        System.out.println("myLong = " + myLong);
        System.out.println("myFirstDouble = " + myFirstDouble);
        System.out.println("mySecondDouble = " + mySecondDouble);
        */

        // You can set all of the numeric primitive data variables to a literal number
        // from 0 to 127.
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;

        // boolean can only be set to true or false
        boolean isTrue = false;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);
    }

}
