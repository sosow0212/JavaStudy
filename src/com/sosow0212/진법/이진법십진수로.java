package com.sosow0212.진법;

import java.util.Scanner;

public class 이진법십진수로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String before = sc.next(); // 2진법 입력
        int after = 0; // 10진법 변환된 수

        int count = 1;
        // 1011
        for (int i = before.length() - 1; i >= 0; i--) {
            after += count * (before.charAt(i) - '0');
            count *= 2;
        }

        System.out.println(after);

    }
}
