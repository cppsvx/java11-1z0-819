package com.craneos.java11.part1.chapter10.trycatch;

class MyFileClass implements AutoCloseable {
    private final int num;
    public MyFileClass(int num) { this.num = num; }
    public void close() {
        System.out.println("Closing: " + num);
    }
}

public class ExampleCloseable {

    public static void main(String... xyz) {
        try (MyFileClass a1 = new MyFileClass(1);
             MyFileClass a2 = new MyFileClass(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }

}
