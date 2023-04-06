package com.sosow0212.JavaStudy.staticFactoryMethod;

import java.util.HashMap;
import java.util.Map;

public class Crew {

    private static final Map<String, Crew> crews = new HashMap<>();

    static {
        crews.put("jay", new Crew("jay"));
        crews.put("odo", new Crew("odo"));
        crews.put("eo", new Crew("eo"));
        crews.put("ure", new Crew("ure"));
        crews.put("kokodak", new Crew("kokodak"));
        crews.put("sungha", new Crew("sungha"));
    }

    private final String crew;

    public Crew(final String crew) {
        this.crew = crew;
    }

    public static Crew from(final String crew) {
        return crews.get(crew);
    }
}
