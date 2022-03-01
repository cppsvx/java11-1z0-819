package com.craneos.java11.part1.chapter2.var;

import java.util.ArrayList;
import java.util.Arrays;

public class Var {

    //private static var m = 4; // DOES NOT COMPILE - ONLY LOCAL

    public static void main(String[] args) {
        // Yes, you can name your LVTI variable "var"
        var var = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        // And yes, you can name your method var...
        var(var);
        var(var, true);
    }

    // You cannot have a method parameter of type var, but you can have
    // a method named "var" and a method parameter named "var"
    private static void var(ArrayList<String> var) {
        // How confusing can we make it?
        // Use LVTI to set local variable to our method parameter named var
        var x = var;
        // More so...
        for (var y : x) {
            System.out.println("var y =" + y);
        }
    }

    private static void var(ArrayList<String> parameter, boolean isTrue) {
        // How confusing can we make it?
        // Use LVTI to set local variable to our method parameter named var
        var var = parameter;
        // More so...
        for (var y : var) {
            System.out.println("var y =" + y);
        }
    }

}
