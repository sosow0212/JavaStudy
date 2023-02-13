package com.sosow0212.JavaStudy.first_class_collection;

import java.util.ArrayList;
import java.util.List;

public class CarController {

    private static final int MOVE_TRY_COUNT = 5;

    // 게임의 전반적인 흐름을 담당
    public void startGame() {
        // 1. 일급 컬렉션 사용했을 때, getter()를 만들지 않으면 불변성을 보장!
        Cars cars = new Cars(makeCars());
    }

    // 1. 게임에 필요한 자동차 세팅
    private List<Car> makeCars() {
        Car odo = new Car("odo");
        Car kokodak = new Car("kokodak");
        Car jay = new Car("jay");

        List<Car> cars = List.of(odo, kokodak, jay);
        return cars;
    }


    // 2. 게임을 5번 수행!
    private void startRace(final Cars cars) {
        for (int i = 0; i < MOVE_TRY_COUNT; i++) {
            cars.moveAll();
        }
    }

}
