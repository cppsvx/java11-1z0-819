package com.craneos.java11.part2.chapter15.supplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class ExampleSupplier {

    public static void main(String[] args){
        testSuppliers1();
        testSuppliers2();
        testSuppliers3();
    }

    public static void testSuppliers1() {
        System.out.println("\n----------------------------- testSuppliers1 ------------------------");
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);
    }

    public static void testSuppliers2() {
        System.out.println("\n----------------------------- testSuppliers2 ------------------------");
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder("s1");

        System.out.println(s1.get());
        System.out.println(s2.get());
    }

    public static void testSuppliers3() {
        System.out.println("\n----------------------------- testSuppliers3 ------------------------");
        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();
        System.out.println("a1: "+a1);
        System.out.println("s3: "+s3);
        System.out.println("$$ --> means that the class doesn't exist in a class file on the file system. It exists only in memory");
    }
}