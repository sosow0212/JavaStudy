package com.sosow0212.JavaStudy.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    public static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
