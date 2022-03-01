package com.craneos.java11.part2.chapter13.annotations;

@interface Injured {
    String veterinarian() default "unassigned";
    String value() default "foot";
    int age() default 1;
}

public abstract class DefaultValueAnnotations {
    @Injured("Legs") public void fallDown() {}
    @Injured(value="Legs") public abstract int trip();
    @Injured String injuries[];
}
