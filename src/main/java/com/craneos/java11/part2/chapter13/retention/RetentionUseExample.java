package com.craneos.java11.part2.chapter13.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS) @interface Flier {}
@Retention(RetentionPolicy.RUNTIME) @interface Swimmer {}
public class RetentionUseExample {

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1(){
        StringBuilder sb = new StringBuilder();
        sb.append("@Retention(RetentionPolicy.CLASS) @interface Flier {}\n" +
                "@Retention(RetentionPolicy.RUNTIME) @interface Swimmer {}\n");
        sb.append("In this example, both annotations will retain the annotation information in\n" +
                "their .class files, although only Swimmer will be available (via reflection)\n" +
                "at runtime.");
        System.out.println(sb);
    }

}
