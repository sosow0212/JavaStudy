package com.sosow0212.JavaStudy.lambda;

import java.util.List;

class Apple {

    private final String color;
    private final int weight;

    public Apple(final String color, final int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isRed() {
        return this.color.equals("red");
    }
}

public class Main {

    public static void main(String[] args) {
        List<Apple> apples = List.of(
                new Apple("red", 3),
                new Apple("blue", 10),
                new Apple("green", 11),
                new Apple("white", 12)
        );

        List<Apple> filtered = Lambda.filter(apples, (Apple apple) -> apple.getWeight() == 10);
        List<Apple> filtered2 = Lambda.filter(apples, Apple::isRed);

        System.out.println(filtered.get(0).getWeight());
    }
}
