package com.craneos.java11.part2.chapter13.supress;

import java.util.*;

class SongBird {
    @Deprecated static void sing(int volume) {}
    static Object chirp(List<String> data) {
        return data.size();
    }
}

public class Suppress {
    @SuppressWarnings("deprecation")
    public void wakeUp() {
        SongBird.sing(10);
    }
    @SuppressWarnings("unchecked")
    public void goToBed() {
        // call to .chirp does not define a generic type. THIS IS A WARNING
        SongBird.chirp(new ArrayList());
    }
    public static void main(String[] args) {
        var birdy = new Suppress();
        birdy.wakeUp();
        birdy.goToBed();
    }
}