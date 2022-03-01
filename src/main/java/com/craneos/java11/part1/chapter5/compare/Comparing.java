package com.craneos.java11.part1.chapter5.compare;

import java.util.Arrays;

public class Comparing {

    public static void main(String[] args) {
        testCaseCompare();
        testCaseMismatch();
    }

    private static void testCaseCompare(){
        System.out.println("--------- SORT COMPARE --------");
        System.out.println("Arrays.compare(new int[] {1}, new int[]{2}) --> "+Arrays.compare(new int[] {1}, new int[]{2}));
        System.out.println("Arrays.compare(new int[] {2}, new int[]{1}) --> "+Arrays.compare(new int[] {2}, new int[]{1}));
        System.out.println("Arrays.compare(new int[] {3}, new int[]{3}) --> "+Arrays.compare(new int[] {3}, new int[]{3}));
        System.out.println("Arrays.compare(new int[] {3,4}, new int[]{3}) --> "+Arrays.compare(new int[] {3, 4}, new int[]{3}));
        System.out.println("Arrays.compare(new int[] {3}, new int[]{3,4}) --> "+Arrays.compare(new int[] {3}, new int[]{3,4}));
        System.out.println("Arrays.compare(new String[] {\"abc\"}, new String[]{null}) --> "+Arrays.compare(new String[] {"abc"}, new String[]{null}));
        System.out.println("Arrays.compare(new String[] {\"a\"}, new String[]{\"A\"}) --> "+Arrays.compare(new String[] {"a"}, new String[]{"A"}));
        System.out.println("Arrays.compare(new String[] {\"A\"}, new String[]{\"a\"}) --> "+Arrays.compare(new String[] {"A"}, new String[]{"a"}));
    }

    private static void testCaseMismatch(){
        System.out.println("--------- SORT MISMATCH --------");
        System.out.println("Arrays.mismatch(new int[] {1}, new int[]{2}) --> "+Arrays.mismatch(new int[] {1}, new int[]{2}));
        System.out.println("Arrays.mismatch(new int[] {2}, new int[]{1}) --> "+Arrays.mismatch(new int[] {2}, new int[]{1}));
        System.out.println("Arrays.mismatch(new int[] {3}, new int[]{3}) --> "+Arrays.mismatch(new int[] {3}, new int[]{3}));
        System.out.println("Arrays.mismatch(new int[] {3,4}, new int[]{3}) --> "+Arrays.mismatch(new int[] {3, 4}, new int[]{3}));
        System.out.println("Arrays.mismatch(new int[] {3}, new int[]{3,4}) --> "+Arrays.mismatch(new int[] {3}, new int[]{3,4}));
        System.out.println("Arrays.mismatch(new String[] {\"abc\"}, new String[]{null}) --> "+Arrays.mismatch(new String[] {"abc"}, new String[]{null}));
        System.out.println("Arrays.mismatch(new String[] {\"a\"}, new String[]{\"A\"}) --> "+Arrays.mismatch(new String[] {"a"}, new String[]{"A"}));
        System.out.println("Arrays.mismatch(new String[] {\"A\"}, new String[]{\"a\"}) --> "+Arrays.mismatch(new String[] {"A"}, new String[]{"a"}));
    }
}
