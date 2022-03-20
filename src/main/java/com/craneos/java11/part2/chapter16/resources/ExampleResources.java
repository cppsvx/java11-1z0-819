package com.craneos.java11.part2.chapter16.resources;

import java.util.Locale;
import java.util.ResourceBundle;

public class ExampleResources {

    public static void main(String[] args) {
        testResources();
    }

    public static void testResources(){
        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("es", "ES");
        ResourceBundle rb = ResourceBundle.getBundle("examples/zoo", locale);
        //
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
    }
}