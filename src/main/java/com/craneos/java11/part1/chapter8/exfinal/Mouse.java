package com.craneos.java11.part1.chapter8.exfinal;

import com.craneos.java11.part1.chapter8.exprivate.Common;

public class Mouse extends Common {

    private final int volume;
    private final String type;
    private final String name;

    {
        System.out.println("First static block ");
    }

    public Mouse() {
        this(null);
        System.out.println("Constructor Mouse()");
    }

    public Mouse(String type) {
        System.out.println("Constructor Mouse(String type)");
        this.volume = 10;
        this.type = type;
    }

    {
        System.out.println("Second static block ");
        name = "Minnie";
        System.out.println("Name: "+name);
    }

}