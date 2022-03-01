package com.craneos.java11.part1.chapter8.override;

import java.util.ArrayList;
import java.util.List;

public class OverrideExample {
    protected CharSequence getName() {
        return "rhino";
    }
    protected String getColor() {
        return "grey, black, or white";
    }
}
class Example extends OverrideExample {
    public String getName() {
        return "javan rhino";
    }
    /*public CharSequence getColor() { // DOES NOT COMPILE
        return "grey";
    }*/

    protected void playBefore(List<String> input) {}
    public List<CharSequence> play() {return null;}
    public List<String> playAgain() {return null;}
    public CharSequence sleep() {return null;}
}

class SubExample1 extends Example {
    protected void playBefore(List<String> input) {}
    public ArrayList<CharSequence> play() { return null; }
    public List<String> playAgain() { return null; }
}
class SubExample2 extends Example {
    // DOES NOT COMPILE
    /*public List<String> play() {
        return null;
    }*/

    public String sleep() {
        return null;
    }
}