package com.craneos.java11.part1.chapter1.examples; // PACKAGE IS OPTIONAL

import java.io.File;
import java.nio.file.Paths;
//import java.nio.*.*; // NOT VALID. DOES NOT COMPILE
import java.lang.System;
import java.lang.*;

/**
 * The code does not compile because of line 24.
 *
 * - The fact that the Date class exists in both packages does not impact the ability to import both packages,
 * so lines 1 and 2 compile without issue, and Option A is incorrect.
 * - Line 4 will not compile because the Date class used is ambiguous, making Option B correct and Option D incorrect
 * - Option C is incorrect because line 5 does compile, as the fully qualified name of the class is used.
 *
 * http://www.java2s.com/ref/java/java-oca-ocp-practice-question-19.html
 */
public class Imports {

    //private Date d = new Date();
    private java.util.Date my = new java.util.Date();

    public static void main(String[] args) {
        System.out.println("Hi Demo imports!");
    }

    public void read(File files){
        Paths.get("name");
    }

}