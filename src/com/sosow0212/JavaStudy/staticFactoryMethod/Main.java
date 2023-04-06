package com.sosow0212.JavaStudy.staticFactoryMethod;

public class Main {

    public static void main(String[] args) {
        Crew crew1 = Crew.from("jay");
        Crew crew2 = Crew.from("jay");

        System.out.println(crew1 == crew2); // true

        Animal dog = Animal.createAnimal("dog");
        dog.makeSound(); // 멍멍

        Animal cat = Animal.createAnimal("cat");
        cat.makeSound(); // 야옹
    }
}
