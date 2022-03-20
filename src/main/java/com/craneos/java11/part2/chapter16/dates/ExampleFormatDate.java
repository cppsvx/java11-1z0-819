package com.craneos.java11.part2.chapter16.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ExampleFormatDate {

    public static void main(String[] args){
        testDate1();
        testDate2();
        testDate3();
    }

    public static void testDate1() {
        System.out.println("\n----------------------------- testDate1 ------------------------");
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        System.out.println(date.getDayOfWeek()); // TUESDAY
        System.out.println(date.getMonth()); // OCTOBER
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 294
    }

    public static void testDate2() {
        System.out.println("\n----------------------------- testDate2 ------------------------");
        // Java provides a class called DateTimeFormatter to display standard formats.
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public static void testDate3() {
        System.out.println("\n----------------------------- testDate3 ------------------------");
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);
        // Java provides a class called DateTimeFormatter to display standard formats.
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f)); // October 20, 2020 at11:12
    }
}
