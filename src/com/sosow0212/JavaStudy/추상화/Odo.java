package com.sosow0212.JavaStudy.추상화;

public class Odo extends Student {

    public Odo(final String nickname, final String location) {
        super(nickname, location);
    }

    @Override
    public void introduceMySelf() {
        System.out.println("저는 귀여운 " + this.nickname + "입니다.");
    }
}
