package com.sosow0212.EffectiveJava.factoryMethod.fac;

public class Car {

    private String name;
    private int distance;
    private int size;
    private int speedLimit;
    private int countOfTire;

    public Car(final String name, final int distance, final int size, final int speedLimit) {
        this.name = name;
        this.distance = distance;
        this.size = size;
        this.speedLimit = speedLimit;
    }

    // 요구사항 1번
    public Car(final String name, final int distance) {
        this.name = name;
        this.distance = distance;
    }

    // 요구사항 2번
    public Car(final String name) {
        this.name = name;
        this.distance = 0;
    }

    // 요구사항 3번

    public Car(final int distance) {
        this.name = "null";
        this.distance = distance;
    }

    private Car(Builder builder) {
        this.name = builder.name;
        this.distance = builder.distance;
        this.size = builder.size;
        this.speedLimit = builder.speedLimit;
        this.countOfTire = builder.countOfTire;
    }

    public static class Builder {
        private String name;
        private int distance;
        private int size;
        private int speedLimit;
        private int countOfTire;

        public Builder(String name) {
            this.name = name;
        }

        public Builder distance(int distance) {
            this.distance = distance;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder speedLimit(int speedLimit) {
            this.speedLimit = speedLimit;
            return this;
        }

        public Builder countOfTire(int countOfTire) {
            this.countOfTire = countOfTire;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
