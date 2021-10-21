package com.sosow0212.이론;

import java.util.Scanner;

public class 배열 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = i;
        }

        for(int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }

    }
}
