package com.craneos.java11.part1.chapter5.stringbuilders;

public class StringBuilderAppendInsert {
    public static void main(String[] args) {

        /*
            These are the many flavors of append:

            StringBuilder append(boolean b)
            StringBuilder append(char c)
            StringBuilder append(char[] str)
            StringBuilder append(char[] str, int offset, int len)
            StringBuilder append(double d)
            StringBuilder append(float f)
            StringBuilder append(int i)
            StringBuilder append(long lng)
            StringBuilder append(CharSequence s)
            StringBuilder append(CharSequence s, int start, int end)
            StringBuilder append(Object obj)
            StringBuilder append(String str)
            StringBuilder append(StringBuffer sb)
            StringBuilder appendCodePoint(int codePoint)
         */

        StringBuilder sb = new StringBuilder(100);
        sb.append("Hello ")
                .append(new char[]{'W', 'o', 'r', 'l', 'd'})
                .append(',')
                .append((Object) " My ")
                .append("NewNumber ", 3, 9)
                .append(" is ")
                .appendCodePoint(97)
                .append(" float with the value of: ")
                .append(204.50f);
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());
    }
}