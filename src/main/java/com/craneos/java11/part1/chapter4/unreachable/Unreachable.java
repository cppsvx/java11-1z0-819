package com.craneos.java11.part1.chapter4.unreachable;

public class Unreachable {

    public static void main(String[] args) {
        int checkDate = 0;
        while(checkDate<10) {
            checkDate++;
            if(checkDate>100) {
                break;
                //checkDate++; // DOES NOT COMPILE
            }
        }
    }
}
