package com.sosow0212;

public class classAnimal {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        classAnimal dog = new classAnimal();
        dog.setName("봉구");
        System.out.println("dog name= " + dog.name);
    }
}
