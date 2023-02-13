package com.sosow0212.JavaStudy.first_class_collection;

public class Car {

    private final String name; // 자동차 이름
    private int position; // 자동차의 위치

    // 처음에 자동차 생성시에 자동차의 위치는 0이다.
    public Car(final String name) {
        validate(name);
        this.name = name;
        position = 0;
    }

    // 이름이 null값이 되면 에러 발생!
    private void validate(final String name) {
        if(name == null) {
            throw new IllegalArgumentException("이름은 null값이면 안됩니다.");
        }
    }

    // move() 메서드는 현재 자동차 위치 +1을 해주는 메서드
    public void move() {
        this.position++;
    }

    // 자동차의 이름을 반환한다.
    public String getName() {
        return name;
    }

    // 자동차의 현재 위치 반환한다
    public int getPosition() {
        return position;
    }
}
