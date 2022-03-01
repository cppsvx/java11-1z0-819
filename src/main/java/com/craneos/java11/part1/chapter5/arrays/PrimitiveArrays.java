package com.craneos.java11.part1.chapter5.arrays;

public class PrimitiveArrays {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    private static void testCase1(){
        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

    }

    private static void testCase2(){
        System.out.println("--------- ARRAYS DEFINITION 1 --------");
        int[] ids, types;
        ids = new int[]{2,3,4};
        types = new int[]{2,3,4};
        System.out.println("Example of defined --> int[] ids, types;");
        System.out.println("ids is an array: "+ids.length);
        System.out.println("types is an array: "+types.length);

        System.out.println("--------- ARRAYS DEFINITION 2 --------");
        int ids1[], types1;
        ids1 = new int[]{2,3,4};
        types1 = 32;
        System.out.println("Example of defined --> int ids1[], types1;");
        System.out.println("ids is an array: "+ids1.length);
        System.out.println("types is NOT an array: "+types1);
    }
}
