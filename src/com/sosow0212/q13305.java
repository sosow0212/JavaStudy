package com.sosow0212;

import java.util.Scanner;

public class q13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 도시의 수
        int[] price = new int[n]; // 도시 별 리터당 주유소 가격
        int[] length = new int[n - 1]; // 도시 간 거리

        for (int i = 0; i < n - 1; i++) {
            length[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int total = 0;
        int minPrice = price[0];

        for (int i = 0; i < n - 1; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            total += (minPrice * length[i]);
        }

        System.out.println(total);


    }
}
