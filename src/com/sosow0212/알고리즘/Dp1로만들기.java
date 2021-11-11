package com.sosow0212.알고리즘;

import java.util.Scanner;

// 정수 X가 주어질 때, X에 사용할 수 있는 연산은 4가지이다.
// - X가 5로 나눠 떨어지면, 5로 나눈다
// - X가 3으로 나눠 떨어지면, 3으로 나눈다.
// - X가 2로 나눠 떨어지면, 2로 나눈다.
// - X에서 1을 뺀다.

// X가 주어질 때, 연산 4개를 적절히 이용하여 값을 1로 만들 때, 최솟값을 구해라
// Ex) X=26 , 3번은 최소의 연산이다 (26 - 25 - 5 - 1)

public class Dp1로만들기 {

    public static int[] d = new int[30000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // DP 바텀업
        for (int i = 2; i <= x; i++) {
            // 1을 빼는 경우
            d[i] = d[i - 1] + 1;

            // 2로 나눠지는 경우
            if (i % 2 == 0)
                d[i] = Math.min(d[i], d[i / 2] + 1);

            // 3으로 나눠지는 경우
            if (i % 3 == 0)
                d[i] = Math.min(d[i], d[i / 3] + 1);

            // 5로 나눠지는 경우
            if (i % 5 == 0)
                d[i] = Math.min(d[i], d[i / 5] + 1);
        }
        System.out.println(d[x]);

    }
}
