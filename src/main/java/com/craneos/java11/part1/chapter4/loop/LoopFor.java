package com.craneos.java11.part1.chapter4.loop;

public class LoopFor {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }

    public static void testCase1(){
        System.out.println("--------- FOR LOOP 1 --------");
        /*for(long y=0, int x=3; x<5; x++){
            System.out.println("This does not compile");
        }*/
        for(long y=0, x=3; x<5; x++){
            System.out.println("This compile");
        }
    }

    public static void testCase2(){
        System.out.println("--------- FOR LOOP 2 --------");
        for(int i=0; i<10;){
            i = i++;
            System.out.println("Infinite loop!!!!!");
            break; // BREAKING THE INFINITE LOOP
        }
    }

    public static void testCase3(){
        System.out.println("--------- FOR LOOP 3 --------");
        // You cannot reference a label inside a for loop that is not
        // associated to the for loop, unless the for loop is nested
        int i = 0, j = 0, jmax = 4;
        OUTER_LABEL: for (i = 0; i <= 4; i++) {
            System.out.println(" i = " + i + " FIRST STATEMENT");
            if (i == 0) {
                System.out.println("\t i = " + i + ", CONTINUE OUTER_LABEL");
                continue OUTER_LABEL;
            }

            INNER_LABEL: for (j = 0; j < 3; j++) {
                System.out.println("\t\tj = " + j + " FIRST ");
                if (i == 1 && j == 0) {
                    System.out.println("\t\t\tj = " + j + " CONTINUE INNER_LABEL");
                    continue INNER_LABEL;
                }
                if (i == 2 && j == 1) {
                    System.out.println("\t\t\tj = " + j + " BREAK INNER_LABEL");
                    // Here, we are breaking out of the inner loop
                    break INNER_LABEL;
                }
                if (i == 3 && j == 2) {
                    System.out.println("\t\t\tj = " + j + " BREAK OUTER LABEL");
                    // Here we are breaking out of both loops
                    break OUTER_LABEL;
                }
                System.out.println("\t\tj = " + j + " LAST ");

            }
            System.out.println(" i = " + i + " LAST STATEMENT");
        }
        System.out.println("OUTSIDE OF LOOPS: i = " + i + ", j = " + j);
    }

    public static void testCase4(){
        System.out.println("--------- FOR LOOP 4 --------");
        int i = 0;
        // First, let's throw an exception in the initialization block...
        try {
            // termination section of for loop declaration has prefix increment
            // increment section of for loop declaration uses postfix increment
            for (interruptIt(i); ++i < 10; i++) {
                System.out.println("A forloop: i = " + i);
            }
        } catch (Exception e) {
            System.out.println(e + ": i = " + i);
        }
    }

    public static int interruptIt(int i) throws Exception {
        System.out.println("interruptIt: i = " + i);
        if (i < 10) throw new Exception("Break it up");
        return i;
    }

    public static void testCase5(){
        System.out.println("--------- FOR LOOP 5 --------");
        for (int i=0; ++i < 10; i++) {
            System.out.println("A forloop: i = " + i);
        }
    }
}
