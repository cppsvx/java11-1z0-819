package com.craneos.java11.part1.chapter10.trycatch;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryResources {

    public static void main(String[] args) {
        testCase1("name of file");
        testCase2();
    }

    public static void testCase1(String file) {
        try (FileInputStream is = new FileInputStream(file);FileInputStream is2 = new FileInputStream(file)) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testCase2() {
        try (var f = new BufferedInputStream(new FileInputStream("it.txt"))) {
            // Process file
            System.out.println(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //System.out.println(f); // DOES NOT COMPILE
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(f); // DOES NOT COMPILE
        }
    }

}
