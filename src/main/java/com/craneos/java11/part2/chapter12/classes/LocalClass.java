package com.craneos.java11.part2.chapter12.classes;

public class LocalClass {

    private int length = 5;
    public void calculate() {
        final int width = 20;
        class MyLocalClass {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        MyLocalClass local = new MyLocalClass();
        local.multiply();
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    private static void testCase1(){
        LocalClass outer = new LocalClass();
        outer.calculate();
    }

    private static int testCase2(){
        final int length = 5;
        int width = 10;
        int height = 2; //final due is not modified during the scope
        class VolumeCalculator {
            public int multiply() {
                //return length * width * height; // DOES NOT COMPILE
                return 5;
            }
        }
        width = 2;
        return width;
    }

}
