package com.craneos.java11.part2.chapter13.repeteable;

import java.lang.annotation.Repeatable;

/** -Containing annotation type- is a separate annotation that defines a
 value() array element. The type of this array is the particular annotation
 you want to repeat.
 */
@interface Risks {
    Risk[] value();
}

/**
 * to declare a @Repeatable annotation, you must define a containing annotation type value.
 * Check previous declard annotation, named Risks.
 */
@Repeatable(Risks.class)
@interface Risk {
    String danger();
    int level() default 1;
}

public class Zoo {
    public static class Monkey {}
    @Risk(danger="Silly")
    @Risk(danger="Aggressive",level=5)
    @Risk(danger="Violent",level=10)
    private Monkey monkey;

    @Risks({
        @Risk(danger="Silly"),
        @Risk(danger="Aggressive",level=5),
        @Risk(danger="Violent",level=10)
    })
    private Monkey monkey2;
}
