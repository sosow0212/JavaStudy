package com.sosow0212;

public class MethodTest {
    static int M = 0;

    public static void plus(int a) {
        a++;
    }

    public static void main(String[] args) {
        int numA = 10, numB = 10;
        System.out.println(M);
        plus(M);
        System.out.println(M);

    }
}
