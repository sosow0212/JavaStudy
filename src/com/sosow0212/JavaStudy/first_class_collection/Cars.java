package com.sosow0212.JavaStudy.first_class_collection;

import java.util.List;

public class Cars {

    // 일급 컬렉션에서 멤버 변수는 하나여야 한다!
    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    // moveAll()은 Cars가 관리하고 있는 자동차들의 위치를 모두 +1 시킨다.
    public void moveAll() {
        for (final Car car : cars) {
            car.move();
        }
    }
}
