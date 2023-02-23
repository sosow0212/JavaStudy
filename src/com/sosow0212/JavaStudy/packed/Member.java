package com.sosow0212.JavaStudy.packed;

public class Member {

    private final Name name;
    private final Age age;

    public Member(final String name, final int age) {
        this.name = new Name(name);
        this.age = new Age(age);
    }

    public String getName() {
        return this.name.getName();
    }

    public int getAge() {
        return this.age.getAge();
    }
}

class Name {

    private final String name;

    public Name(final String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validate(final String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException();
        }
    }
}

class Age {

    private final int age;

    public Age(final int age) {
        validate(age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private void validate(final int age) {
        if (age < 10) {
            throw new IllegalArgumentException();
        }
    }
}
