package com.sosow0212.이론;

import java.util.ArrayList;

public class 리스트 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("이");

        for(int i=0; i<3; i++) {
            System.out.println("list.get[" + i + "]" + " == " + list.get(i));
        }
        System.out.println(list);

        // list.remove("이") 하면 개별 삭제
        list.clear();

        System.out.println(list);
    }
}
