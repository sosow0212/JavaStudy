package com.sosow0212.EffectiveJava;

public class 정적팩터리메서드 {

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    // 기본 타입인 boolean 값을 받아서 Boolean 객체 참조로 반환해준다.
}
