package com.sosow0212.JavaStudy.overriding;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.display();
        child.display("hello world");
    }
}

class Parent {
    void display() {
        System.out.println("부모 클래스의 display() 메소드입니다.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        // 부모 클래스를 상속 받아서, 메소드를 재정의 하는 것이 Overriding
        System.out.println("자식 클래스의 display() 메소드입니다. Overriding");
    }

    void display(String str) {
        // 새로운 메소드를 재정의 하는 것이 Overloading
        System.out.println(str + " 를 입력하셨습니다. Overloading");
    }

    void display2() {
        System.out.println("display2");
    }
}