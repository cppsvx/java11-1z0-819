package com.craneos.java11.part2.chapter13.deprecated;

import java.lang.annotation.Documented;

@Documented @interface Example {}

@Example
public class DeprecatedUseExample {

    public static void main(String[] args) {
        testCase1("message");
    }

    /**
     * Performs a light show at the zoo.
     *
     * @param param params in this example
     * @return void, no data to return.
     * @author Me
     * @since 1.8
     * @deprecated Use testCase2 instead.
     */
    @Deprecated(since="1.8", forRemoval = true)
    public static void testCase1(String param){
        StringBuilder sb = new StringBuilder();
        sb.append("Be careful not to confuse Javadoc annotations with the Java annotations. Take a look at the @deprecated and @Deprecated annotations in this example.");
        sb.append("The first, @deprecated, is a Javadoc annotation used inside a comment, while @Deprecated is a Java annotation applied to a class.");
        sb.append("Traditionally, Javadoc annotations are all lowercase, while Java annotations start with an uppercase letter.");
        System.out.println(sb);
        System.out.println(param);
    }

}
