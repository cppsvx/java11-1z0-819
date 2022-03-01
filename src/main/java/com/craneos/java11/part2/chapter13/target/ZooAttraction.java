package com.craneos.java11.part2.chapter13.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface ZooAttraction {}

///@ZooAttraction class RollerCoaster {} // DOES NOT COMPILE
class Events {

    @ZooAttraction public Events() {
    }

    @ZooAttraction String rideTrain() {
        //return (@ZooAttraction String) "Fun!";// DOES NOT COMPILE
        return "Fun!";
    }
    /*@ZooAttraction Events(@ZooAttraction String description) {// DOES NOT COMPILE
        super();
    }*/
    //@ZooAttraction int numPassengers;// DOES NOT COMPILE
}