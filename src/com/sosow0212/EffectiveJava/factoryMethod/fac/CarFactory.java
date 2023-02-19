package com.sosow0212.EffectiveJava.factoryMethod.fac;

public class CarFactory {

    public static Car createCarWithAllInformation(final String name, final int distance) {
        return new Car(name, distance);
    }

    public static Car createCarWithName(final String name) {
        return new Car(name);
    }

    public static Car createCarWithDistance(final int distance) {
        return new Car(distance);
    }
}
