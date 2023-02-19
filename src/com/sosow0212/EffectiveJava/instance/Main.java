package com.sosow0212.EffectiveJava.instance;

public class Main {

    public void main(String[] args) {
        Person person = new Person();
        String jay = person.findName();
    }
}

class Name {
    private final String name;

    public Name() {
        this.name = "jay";
    }

    public String name() {
        return name;
    }
}

class Person {
    private Name name;

    public Person() {
        this.name = new Name();
    }

    public String findName() {
        return this.name.name();
    }
}

