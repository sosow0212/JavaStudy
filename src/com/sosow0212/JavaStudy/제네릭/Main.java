package com.sosow0212.JavaStudy.제네릭;

public class Main {
    public static void main(String[] args) {
        MyArray<String> arr = new MyArray<>();
        arr.setElement("dd");
        System.out.println(arr.getElement());
        say();


    }

    public static void say() {
        System.out.println("dsadada");
    }

}
