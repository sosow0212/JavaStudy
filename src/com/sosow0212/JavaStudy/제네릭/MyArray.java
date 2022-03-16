package com.sosow0212.JavaStudy.제네릭;

public class MyArray<T> {
    T element;

    void setElement(T element) {
        this.element = element;
    }

    T getElement() {
        return element;
    }
}
