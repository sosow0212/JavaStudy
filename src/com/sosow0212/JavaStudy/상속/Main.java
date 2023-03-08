package com.sosow0212.JavaStudy.상속;

class Human {

    private final String name;
    private final int age;

    public Human(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public void introduceMySelf() {
        System.out.println("저는 " + name + "입니다. " + age + "살입니다.");
    }
}

class Jay extends Human {

    public Jay(final String name, final int age) {
        super(name, age);
    }

    public void showFavoriteFood() {
        System.out.println("좋아하는 음식은 회");
    }
}

class Odo extends Human {
    public Odo(final String name, final int age) {
        super(name, age);
    }

    public void showMyLocation() {
        System.out.println("나의 지역은 서울대입구역");
    }
}


public class Main {
    public static void main(String[] args) {
        Jay jay = new Jay("제이", 25);
        jay.introduceMySelf(); // 공통 로직
        jay.showFavoriteFood(); // 추가된 로직

        Odo odo = new Odo("오도", 24);
        odo.introduceMySelf(); // 공통 로직
        odo.showMyLocation(); // 추가된 로직
    }
}
