package com.craneos.java11.part1.chapter5;

public class Examples {

    public static void main(String[] args) {
        testCase1();
    }

    /** A, C, D. The code compiles fine. Line 3 points to the String in the string
        pool. Line 4 calls the String constructor explicitly and is therefore a
        different object than s.
        Line 5 checks for object equality, which is true, and so prints one.
        Line 6 uses object reference equality, which is not true since we have different objects.
        Line 7 calls intern(), which returns the value from the string pool and is therefore the same reference as s.
        Line 8 also compares references but is true since both references point to the object from the string pool.
        Line 9 is a trick. The string Hello is already in the string pool, so calling intern() does not change anything.
        The reference t is a different object, so the result is still false.
     */
    private static void testCase1() {
        // 3
        var s = "Hello";
        // 4
        var t = new String(s);
        // 5
        if ("Hello".equals(s)) System.out.println("one");
        // 6
        if (t == s) System.out.println("two");
        // 7
        if (t.intern() == s) System.out.println("three");
        // 8
        if ("Hello" == s) System.out.println("four");
        // 9
        if ("Hello".intern() == t) System.out.println("five");
    }

}
