package com.sosow0212;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class q24678 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int t = 0; t < n; t++) {
            int count = 1;
            int temp = 0;
            int arr[] = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            // 내림차순 정렬
            Arrays.sort(arr);
            // 1 2 3

            while (temp < 2) {
                if (temp == 0) {
                    arr[0] -= 1;
                    arr[1] -= 1;
                    for (int j = 0; j < 2; j++) {
                        if (arr[j] == 0) {
                            temp++;
                        }
                    }
                    count++;
                } else if (temp == 1) {
                    arr[1] -= 1;
                    arr[2] -= 1;
                    for (int j = 1; j < 3; j++) {
                        if (arr[j] == 0) {
                            temp++;
                        }
                    }
                    count++;
                }
            }

            if (count % 2 == 1) {
                System.out.println("R");
            } else {
                System.out.println("B");
            }
        }


    }
}
