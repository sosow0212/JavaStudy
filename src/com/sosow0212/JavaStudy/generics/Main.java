package com.sosow0212.JavaStudy.generics;

public class Main {

    public static void main(String[] args) {
        JayList<Integer> numberBox = new JayList<>();
        numberBox.setElement(1);
        System.out.println(numberBox.getElement()); // 1


        JayList<String> wordBox = new JayList<>();
        wordBox.setElement("멍멍");
        System.out.println(wordBox.getElement()); // 멍멍
    }
}
