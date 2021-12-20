package com.sosow0212.JavaStudy.알고리즘;

import java.util.Scanner;

public class DP {

    // 배열로 기록을 함으로 시간과 연산을 단축시킨다.
    public static long[] d = new long[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        d[1] = 1;
        d[2] = 1;
        int n = 50; // 50번째 피보나치 수 계산

        for(int i=3; i<=n; i++) {
            d[i] = d[i-1] + d[i-2];
        }

        System.out.println(d[n]);
    }
}
