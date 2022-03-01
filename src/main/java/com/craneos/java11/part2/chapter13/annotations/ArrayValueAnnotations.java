package com.craneos.java11.part2.chapter13.annotations;

@interface Rhythm {
    String[] value();
}

class Capybara {
    @Rhythm(value={"Swing"}) String favorite;
    @Rhythm(value="R&B") String secondFavorite;
    @Rhythm({"Classical"}) String mostDisliked;
    @Rhythm("Country") String lastDisliked;
}

public class ArrayValueAnnotations {
}
