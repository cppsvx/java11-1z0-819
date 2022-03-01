package com.craneos.java11.part2.chapter13.documented;

import java.lang.annotation.Documented;

@Documented @interface Example {}

@Example
public class DocumentedUseExample {

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1(){
        StringBuilder sb = new StringBuilder();
        sb.append("@Documented @interface Example {}\n");
        sb.append("In this example, the @Example annotation would be published with the DocumentedUseExample\n" +
                "Javadoc information because it's marked with the @Documented annotation");
        System.out.println(sb);
    }

}
