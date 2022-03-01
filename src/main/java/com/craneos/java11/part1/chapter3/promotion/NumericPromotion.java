package com.craneos.java11.part1.chapter3.promotion;

//import junit.framework.Assert;

public class NumericPromotion {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    public static void testCase1(){
        short x = 10;
        short y = 10;
        //short z = x * y; //DOES NOT COMPILE
        short w = (short)(x * y);
        int z = x * y;
        System.out.println(String.format("x=%d y=%d w=%d z=%d", x, y, w, z));
        System.out.println("-----------------------------------");
    }

    public static void testCase2(){
        double x = 10;
        float y = 10;
        //float w = x * y; //DOES NOT COMPILE
        float w = (float)(x * y);
        double z = x * y;
        System.out.println(String.format("x=%s y=%s w=%f z=%s", x, y, w, z));
        System.out.println(String.format("x=%f y=%f w=%f z=%f", Double.valueOf(x), Float.valueOf(y), Float.valueOf(w), Double.valueOf(z)));
        System.out.println("-----------------------------------");
        /*Assert.assertEquals(x, 10.0);
        Assert.assertEquals(y, 10.0f);
        Assert.assertEquals(w, 100f);
        Assert.assertEquals(w, 100.0f);
        Assert.assertEquals(z, 100.0);*/
    }
}
