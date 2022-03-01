package com.craneos.java11.part1.chapter4.pswitch;

public class Switch {

    public static void main(String[] args) {
        testCase1("Maddock", "famous");
        testCase2();
    }

    public static int testCase1(String firstname, final String alias){
        String middlename = "Patrick";
        final String surname = "Wilson";
        int id = 0;
        switch (firstname) {
            case "Test":
                System.out.println("Hi Test");
                return 52;
            /*case middlename:
                System.out.println("Hi Test");
                break;*/ // DOES NOT COMPILE
            case surname:
                id = 0;
                break;
            /*case alias:
                id = 0;
                break;
            case 5:
                id = 0;
                break;
            case 'J':
                id = 0;
                break;*/ // DOES NOT COMPILE
            default:
                System.out.println("This is a mess");
                break;
        }
        return id;
    }

    public static int testCase2(){
        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        switch(size) {
            case small:
            case 1+2 :
            //case big: // DOES NOT COMPILE
        }
        return size;
    }

}
