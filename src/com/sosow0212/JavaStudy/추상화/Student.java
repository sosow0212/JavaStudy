package com.sosow0212.JavaStudy.추상화;

public abstract class Student {

    protected final String nickname;
    protected final String location;

    public Student(final String nickname, final String location) {
        this.nickname = nickname;
        this.location = location;
    }

    // 공통 인사
    public void sayHello() {
        System.out.println("우하~");
    }

    // 각 크루별로 자기 소개
    public abstract void introduceMySelf();
}
