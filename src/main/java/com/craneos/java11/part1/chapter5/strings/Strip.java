package com.craneos.java11.part1.chapter5.strings;

public class Strip {

    public static void main(String[] args) {
        testCaseStrip();
    }

    private static void testCaseStrip(){
        String suffix = "ENDING";
        String text = "    Hello my name is JAVA11   *     ";
        System.out.println("Strip         -->"+text.strip()+suffix);
        System.out.println("stripLeading  -->"+text.stripLeading()+suffix);
        System.out.println("stripTrailing -->"+text.stripTrailing()+suffix);
    }
}
