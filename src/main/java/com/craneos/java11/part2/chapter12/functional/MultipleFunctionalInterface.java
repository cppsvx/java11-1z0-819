package com.craneos.java11.part2.chapter12.functional;

// THIS IS NOT
interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }
}

// THIS IS A FUNCTIONAL INTERFACE. It contains only one abstract method: reach().
interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}

public class MultipleFunctionalInterface implements INestedFunctionalInterface {

    public static void main(String[] args) {
        NestedFunctionalInterface tiger = new NestedFunctionalInterface();
        tiger.test(5);
    }

    public void test(int speed) {
        StringBuilder sb = new StringBuilder();
        sb.append("// THIS IS NOT\n" +
                "interface Sleep {\n" +
                "    private void snore() {}\n" +
                "    default int getZzz() { return 1; }\n" +
                "}\n" +
                "\n" +
                "// THIS IS A FUNCTIONAL INTERFACE. It contains only one abstract method: reach().\n" +
                "interface Climb {\n" +
                "    void reach();\n" +
                "    default void fall() {}\n" +
                "    static int getBackUp() { return 100; }\n" +
                "    private static boolean checkHeight() { return true; }\n" +
                "}");
        System.out.println("\n");
        System.out.println("----------- FUNCTIONAL INTERFACE --------------");
        System.out.println(sb);
    }

}
