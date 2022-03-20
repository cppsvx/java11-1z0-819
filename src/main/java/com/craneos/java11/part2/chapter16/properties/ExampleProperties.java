package com.craneos.java11.part2.chapter16.properties;

import java.util.Properties;

public class ExampleProperties {

    public static void main(String[] args) {
        testProperties1();
    }

    public static void testProperties1(){
        var props = new Properties();
        props.setProperty("name", "Our zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel")); //null
        System.out.println(props.getProperty("camel", "Bob")); // Bob
    }
}