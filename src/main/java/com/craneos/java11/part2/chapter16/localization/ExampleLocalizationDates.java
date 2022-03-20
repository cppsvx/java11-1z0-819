package com.craneos.java11.part2.chapter16.localization;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.FormatStyle.SHORT;

public class ExampleLocalizationDates {

    public static void main(String[] args){
        testLocaleDateDefault();
        testLocaleDateItaly();
    }

    /**
     * US // Cannot have country without language
     * enUS // Missing underscore
     * US_en // The country and language are reversed
     * EN // Language must be lowercase
     */
    public static void testLocaleDateDefault() {
        System.out.println("\n----------------------------- testLocaleDateDefault ------------------------");
        Locale.setDefault(new Locale("en", "US"));
        var dt = LocalDateTime.of(2021, Month.FEBRUARY, 27, 15, 12, 34); // 10/20/20, 20/10/20
        print(DateTimeFormatter.ofLocalizedDate(SHORT),dt); // 3:12 PM, 15:12
        print(DateTimeFormatter.ofLocalizedTime(SHORT),dt); // 10/20/20, 3:12 PM, 20/10/20, 15:12
        print(DateTimeFormatter.ofLocalizedDateTime(SHORT,SHORT),dt);
    }

    public static void testLocaleDateItaly() {
        System.out.println("\n----------------------------- testLocaleDateItaly ------------------------");
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.of(2021, Month.FEBRUARY, 27, 15, 12, 34); // 10/20/20, 20/10/20
        print(DateTimeFormatter.ofLocalizedDate(SHORT),dt,italy); // 3:12 PM, 15:12
        print(DateTimeFormatter.ofLocalizedTime(SHORT),dt,italy); // 10/20/20, 3:12 PM, 20/10/20, 15:12
        print(DateTimeFormatter.ofLocalizedDateTime(SHORT,SHORT),dt,italy);
    }

    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime) {
        System.out.println(dtf.format(dateTime) + ", " + dtf.format(dateTime));
    }

    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale) {
        System.out.println(dtf.format(dateTime) + ", " + dtf.withLocale(locale).format(dateTime));
    }
}
