package com.sosow0212.알고리즘;

import java.util.Scanner;

/**
 * 예시입력 : Computercooler , c
 * 예시출력 : 2
 * 문제 : 두번째 입력된 문자가 몇번 나왔는지 출력하시오.
 */
public class 문자개수찾기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next().toString().toLowerCase();
        char point = sc.next().charAt(0);
        int ans = 0;

        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) == point) {
                ans++;
            }
        }

        System.out.println("ans = " + ans);



    }
}
