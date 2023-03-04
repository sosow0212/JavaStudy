package com.sosow0212.JavaStudy.추상화;

public class Jay extends Student{

    public Jay(final String nickname, final String location) {
        super(nickname, location);
    }

    @Override
    public void introduceMySelf() {
        System.out.println("제육을 좋아하는 " + this.nickname + "입니다.");
    }

}
