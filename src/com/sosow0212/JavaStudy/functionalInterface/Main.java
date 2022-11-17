package com.sosow0212.JavaStudy.functionalInterface;

public class Main {
    public static void main(String[] args) {
        boolean compareResult = compare(() -> 10 > 5);
        int generatorResult = generator(() -> 1 + 2);
        System.out.println(compareResult);
        System.out.println(generatorResult);
    }

    public static boolean compare(CompareInterface compareInterface) {
        return compareInterface.compare();
    }

    public static int generator(AddInterface addInterface) {
        return addInterface.generator();
    }
}
