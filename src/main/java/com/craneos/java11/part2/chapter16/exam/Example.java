package com.craneos.java11.part2.chapter16.exam;

public class Example {

    public static void main(String[] args){
        testQuestion1();
    }

    public static void testQuestion1(){
        class Danger extends RuntimeException {
            public Danger(String message) {
                super();
            }
            public Danger(int value) {
                super((String) null);
            }
        }
        class Catastrophe extends Exception {
            public Catastrophe(Throwable c) throws RuntimeException{
                super(new Exception());
                c.printStackTrace();
            }
        }
        /* No default constructor defined
        class Emergency extends Danger {
            public Emergency() {}
            public Emergency(String message) {
                super(message);
            }
        }*/
    }

}