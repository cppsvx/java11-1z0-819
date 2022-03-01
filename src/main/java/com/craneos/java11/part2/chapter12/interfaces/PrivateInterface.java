package com.craneos.java11.part2.chapter12.interfaces;

public interface PrivateInterface {
    private static void breathe(String type) {
        System.out.println("Inhale");
        System.out.println("Performing stroke: " + type);
        System.out.println("Exhale");
    }
    static void butterfly() { breathe("butterfly"); }
    public static void freestyle() { breathe("freestyle"); }
    default void backstroke() { breathe("backstroke"); }
    private void breaststroke() { breathe("breaststroke"); }
}