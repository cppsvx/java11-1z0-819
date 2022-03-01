package com.craneos.java11.part2.chapter13.annotations;

@interface Music {
    String[] genres();
}

class Giraffe {
    @Music(genres={"Rock and roll"}) String mostDisliked;
    @Music(genres="Classical") String favorite;
}

class Reindeer {
    //@Music(genres="Blues","Jazz") String favorite; // DOES NOT COMPILE
    //@Music(genres=) String mostDisliked; // DOES NOT COMPILE
    //@Music(genres=null) String other; // DOES NOT COMPILE
    @Music(genres={}) String alternate;
    @Music(genres={"Blues","Jazz"}) String alternateDuplicated;
}

public class ArrayAnnotations {
}
