package com.craneos.java11.part1.chapter5.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearch {
    public static void main(String[] args) {
        testCaseAll();
        testCaseRegionMatches();
    }

    private static void testCaseAll(){
        System.out.println("--------- ALL --------");
        String fullText = "testwordtestwordtestword";
        //String below is so just there to help see the index easier
        String showIndx = "012345678901234567890123";

        String searchString = "word";

        int lastIndex = fullText.lastIndexOf(searchString);
        System.out.println("lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 19);
        System.out.println("And now the lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 15);
        System.out.println("And now the lastIndex = " + lastIndex);

        // Matches uses regexp Pattern matching, so will NOT match a
// substring directly, unless it is the whole string...
        String mississippi = "mississippi";
        boolean matches = mississippi.matches("miss");
        boolean indexMatch = (mississippi.indexOf("miss") > -1);
        System.out.println("matches method returns " + matches +
                " on 'miss' BUT indexOf>-1 on 'miss' = " + indexMatch);

// Let's try the whole string now...
        matches = mississippi.matches("mississippi");
        System.out.println("matches method matches on the entire string = " + matches);

// Why is it useful then?  You can match on a partial string
// if using regexp expressions surrounding substring

// Code below matches "miss" at the beginnning of the string.
//  Note the (.*) which matches to anything after "miss"
        matches = mississippi.matches("^miss(.*)");
        System.out.println("matches method returns " + matches + " on '^miss(.*)'");

        // Code below matches "iss" in the middle of a string.
        // Note the (.*) which matches all/nothing before/after "miss"
        matches = mississippi.matches("(.*)iss(.*)");
        System.out.println("matches method returns " + matches + " on '(.*)miss(.*)'");

        // You can use Pattern & Matcher to do the same thing...
        Pattern p = Pattern.compile("(.*)miss(.*)");
        Matcher m = p.matcher("mississippi");
        System.out.println("Pattern & Matcher give same result, matches on '(.*)miss(.*)' = "
                + m.matches());
    }

    private static void testCaseRegionMatches(){
        System.out.println("--------- REGION MATCHES --------");
        boolean result;
        String mississippi = "mississippi";
        // Region Matches, exact case, exact substring
        result = mississippi.regionMatches(0, "miss", 0, 4);
        System.out.println("mississippi --> mississippi.regionMatches(0, \"miss\", 0, 4) --> "+result);

        // Region Matches, ignore case, exact substring
        result = mississippi.regionMatches(true, 0, "MISS", 0, 4);
        System.out.println("mississippi --> mississippi.regionMatches(true, 0, \"MISS\", 0, 4) --> "+result);

        // Look for "miss" starting at index 1 in mississippi,
        // no match found
        result = mississippi.regionMatches(1, "miss", 0, 4);
        System.out.println("mississippi --> mississippi.regionMatches(1, \"miss\", 0, 4) --> "+result);

        // Look for "iss" starting at index 2 in mississippi,
        // no match found
        result = mississippi.regionMatches(2, "miss", 1, 3);
        System.out.println("mississippi --> mississippi.regionMatches(2, \"miss\", 1, 3) --> "+result);

        // Look for "iss" starting at index 4 in mississippi,
        // match found
        result = mississippi.regionMatches(4, "miss", 1, 3);
        System.out.println("mississippi --> mississippi.regionMatches(4, \"miss\", 1, 3) --> "+result);
    }
}
