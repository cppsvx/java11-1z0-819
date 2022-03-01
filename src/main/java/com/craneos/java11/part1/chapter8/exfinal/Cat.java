package com.craneos.java11.part1.chapter8.exfinal;

import com.craneos.java11.part1.chapter8.exprivate.Common;

public class Cat extends Common {

    private final int volume;
    private final String type;
    private final String name;

    {
        System.out.println("First static block ");
    }

    public Cat() {
        //this(null);
        type = "aa";
        volume = 2321;
    }

    public Cat(String type) {
        this.volume = 10;
        this.type = type;
    }

    {
        System.out.println("Second static block ");
        name = "Minnie";
        //DOES NOT COMPILE. Variable 'type' might not have been initialized
        //System.out.println("Name: "+name+"   Type: "+type); //DOES NOT COMPILE.
    }

}