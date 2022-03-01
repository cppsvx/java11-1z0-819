package com.craneos.java11.part2.chapter12.classes;

public class NestedClasses {
    private int x = 10;
    class B {
        private int x = 20;
        class C {
            private int x = 30;
            public void allTheX() {
                System.out.println(this.x); // 30
                System.out.println(B.this.x); // 20
                System.out.println(NestedClasses.this.x); // 10
            } } }

    public static void main(String[] args) {
        NestedClasses a = new NestedClasses();
        NestedClasses.B b = a.new B();
        NestedClasses.B.C c = b.new C();
        c.allTheX();
    }
}
