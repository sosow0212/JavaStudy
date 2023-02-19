package com.sosow0212.EffectiveJava.factoryMethod.fac;

public class Main {

    public static void main(String[] args) {
        Car car1 = CarFactory.createCarWithAllInformation("name", 0);
        Car car2 = CarFactory.createCarWithName("name");
        Car car3 = CarFactory.createCarWithDistance(0);

        Car carUsingBuilder = new Car.Builder("MyCar")
                .distance(100)
                .size(5)
                .speedLimit(120)
                .countOfTire(4)
                .build();
    }
}
