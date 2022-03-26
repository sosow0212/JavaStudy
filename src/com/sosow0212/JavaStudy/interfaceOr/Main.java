package com.sosow0212.JavaStudy.interfaceOr;

abstract class Animal {
    abstract void cry();
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("월월");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
