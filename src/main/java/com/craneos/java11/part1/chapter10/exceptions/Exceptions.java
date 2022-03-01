package com.craneos.java11.part1.chapter10.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        try {
            checkedException(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        uncheckedException(null);
    }

    public static void checkedException(String text) throws Exception{
        if (text==null){
            throw new Exception("message is null");
        }
    }

    public static void uncheckedException(String text){
        text.trim();
    }
}
