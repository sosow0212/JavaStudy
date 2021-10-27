package com.sosow0212.이론;

import java.util.Scanner;

public class 스트링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";
        char[] strChar = new char[str.length()];

        System.out.println("str = " + str);
        System.out.println("str.charAt(0) = " + str.charAt(0));
        for(int i=0; i<str.length(); i++) {
            strChar[i] = str.charAt(i);
            System.out.println(strChar[i]);
        }
        System.out.println("---------------------");
        boolean fact = str.equals("Hello");
        System.out.println("fact = " + fact);

        boolean fact2 = str.contains("H");
        System.out.println("fact2 = " + fact2);

    }
}
