package com.craneos.java11.part2.chapter13.repeteable;

import java.lang.annotation.Repeatable;

/** -Containing annotation type- is a separate annotation that defines a
 value() array element. The type of this array is the particular annotation
 you want to repeat.
 */
@interface AnotherRisks {
    AnotherRisk[] value();
}

/**
 * to declare a @Repeatable annotation, you must define a containing annotation type value.
 * Check previous declard annotation, named Risks.
 */
@interface AnotherRisk {
    String danger();
    int level() default 1;
}

public class AnotherZoo {
    public static class Monkey {}

    @AnotherRisks({
            @AnotherRisk(danger="Silly"),
            @AnotherRisk(danger="Aggressive",level=5),
            @AnotherRisk(danger="Violent",level=10)
    })
    private Monkey monkey2;
}
