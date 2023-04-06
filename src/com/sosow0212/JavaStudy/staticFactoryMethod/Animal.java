package com.sosow0212.JavaStudy.staticFactoryMethod;

public abstract class Animal {

    public abstract void makeSound();

    public static Animal createAnimal(final String type) {
        if ("dog".equals(type)) {
            return new Dog();
        }

        if ("cat".equals(type)) {
            return new Cat();
        }

        throw new IllegalArgumentException("올바르지 않은 동물입니다.");
    }

    private static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("멍멍");
        }
    }

    private static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("야옹");
        }
    }
}
