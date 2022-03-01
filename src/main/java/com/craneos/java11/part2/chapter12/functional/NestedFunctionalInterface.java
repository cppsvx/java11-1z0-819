package com.craneos.java11.part2.chapter12.functional;

@java.lang.FunctionalInterface
interface INestedFunctionalInterface {
    public void test(int speed);
}
// THIS IS A FUNCTIONAL INTERFACE
interface SubFunctionalInterfaceA extends INestedFunctionalInterface {}
// THIS IS NOT
interface SubFunctionalInterfaceB extends INestedFunctionalInterface {
    void testB();
}

public class NestedFunctionalInterface implements INestedFunctionalInterface {

    public static void main(String[] args) {
        NestedFunctionalInterface tiger = new NestedFunctionalInterface();
        tiger.test(5);
    }

    public void test(int speed) {
        StringBuilder sb = new StringBuilder();
        sb.append("@java.lang.FunctionalInterface\n" +
                "interface INestedFunctionalInterface {\n" +
                "    public void test(int speed);\n" +
                "}\n" +
                "// THIS IS A FUNCTIONAL INTERFACE\n" +
                "interface SubFunctionalInterfaceA extends INestedFunctionalInterface {}\n" +
                "// THIS IS NOT\n" +
                "interface SubFunctionalInterfaceB extends INestedFunctionalInterface {\n" +
                "    void skip();\n" +
                "}");
        System.out.println("\n");
        System.out.println("----------- NESTED FUNCTIONAL INTERFACE --------------");
        System.out.println("DECLARING A FUNCTIONAL INTERFACE WITH OBJECT METHODS\n");
        System.out.println(sb);
    }

}
