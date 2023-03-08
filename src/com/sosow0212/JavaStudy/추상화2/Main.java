package com.sosow0212.JavaStudy.추상화2;


abstract class Human {

    private final String name;
    private final int age;

    public Human(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    // 추상 메서드
    public abstract void introduceMySelf();

    // 공통 메서드
    public void sayHello() {
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }
}

class Jay extends Human {

    public Jay(final String name, final int age) {
        super(name, age);
    }

    // 추상 메서드를 구현
    @Override
    public void introduceMySelf() {
        System.out.println("저는 제이입니다.");
    }
}

class Odo extends Human {

    public Odo(final String name, final int age) {
        super(name, age);
    }

    // 추상 메서드를 구현
    @Override
    public void introduceMySelf() {
        System.out.println("저는 오도입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Jay jay = new Jay("제이", 25);
        jay.sayHello(); // 공통 로직
        sayMyIntroduce(jay); // jay.introduceMySelf(); 추상 메서드를 구현한 로직

        Odo odo = new Odo("오도", 24);
        odo.sayHello(); // 공통 로직
        sayMyIntroduce(odo); // odo.introduceMySelf(); 추상 메서드를 구현한 로직
    }

    // 다형성!
    public static void sayMyIntroduce(final Human human) {
        human.introduceMySelf();
    }
}
