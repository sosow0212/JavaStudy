package com.sosow0212.JavaStudy.알고리즘;

import java.util.Scanner;

// 개미는 메뚜기의 식량을 터는데, 연속적으로 털 수는 없다
// 예를들면 [1,5,1,3] 이면 5와 3을 털어야 최대 식량을 구할 수 있다.

public class Dp개미전사 {

    public static int[] d = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 식량창고의 개수 n
        int[] arr = new int[n]; // 식량창고에 저장된 식량의 개수 k
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //DP 진행 (바텀업)
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        System.out.println(d[n - 1]);


    }
}
