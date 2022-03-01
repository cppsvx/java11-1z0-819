package com.craneos.java11.part1.chapter3.operators;

public class Operators {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    public static void testCase1(){
        // case 1
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        //  y =   4 * 5 / 4 + 2
        System.out.println("x="+x+"  y="+y);
        //Assert.assertTrue(x==2);
        //Assert.assertTrue(y==7);
    }

    public static void testCase2(){
        int w = 3;
        int z = ++w * 5 / w + --w;
        //  z =   4 * 5 / 4 + 3
        System.out.println("w="+w+"  z="+z);
        //Assert.assertTrue(w==3);
        //Assert.assertTrue(z==8);
    }

    public static void testCase3(){
        int i = 5;
        int j = ++i + i--;
        System.out.println("i="+i+"  j="+j);
        //Assert.assertTrue(i==5);
        //Assert.assertTrue(j==12);
    }
}
