package com.sosow0212.JavaStudy.이론.상속;

public class Dog extends Animal {

    public void sleep() {
        System.out.println(this.name+" zzz");
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
