package com.craneos.java11.part2.chapter12.functional;

interface IFunctionalInterface {
    String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void testCase1();
}

public class FunctionalInterface implements IFunctionalInterface {

    public void testCase1(){
        StringBuilder sb = new StringBuilder();
        sb.append("For the exam, you should be familiar with the following Object method declarations:\n" +
                "* String toString()\n" +
                "* boolean equals(Object)\n" +
                "* int hashCode()\n");
        sb.append("If a functional interface includes an abstract method with the same signature as a public method\n" +
                "found in Object, then those methods do not count toward the single abstract method test");
        System.out.println("\n----------- FUNCTIONAL INTERFACE --------------");
        System.out.println(sb);
        System.out.println("\nExample:");
        System.out.println("interface IFunctionalInterface {\n" +
                "    String toString();\n" +
                "    public boolean equals(Object o);\n" +
                "    public abstract int hashCode();\n" +
                "    public void testCase1();\n" +
                "}");
    }

    public static void main(String[] args) {
        FunctionalInterface fi = new FunctionalInterface();
        fi.testCase1();
    }

}
