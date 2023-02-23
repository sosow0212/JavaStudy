package com.sosow0212.JavaStudy.packed;

public class Member2 {

    private final String name;
    private final int age;

    public Member2(final String name, final int age) {
        validateName(name);
        validateAge(age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void validateName(final String name) {
        if(name.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    private void validateAge(final int age) {
        if(age < 10) {
            throw new IllegalArgumentException();
        }
    }
}
