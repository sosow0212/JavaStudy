package com.sosow0212.JavaStudy.알고리즘;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 * 첫번째줄 입력은 배열의 크기 N이 주어집니다.
 * 두번째줄 입력은 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세번째줄 입력은 두번째 배열의 크기 M이 주어집니다.
 * 네번째줄 입력은 M개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 출력은 오름차순으로 정렬된 배열을 출력합니다.
 *
 * 예시 입력:
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 *
 * 출력 결과:
 * 1 2 3 3 5 6 7 9
 */

public class 두배열합치기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrN = new int[N];
        for(int i=0; i<N; i++) {
            arrN[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arrM = new int[M];
        for(int i=0; i<M; i++) {
            arrM[i] = sc.nextInt();
        }

        int[] ans = new int[arrN.length + arrM.length];
        // 복사할 배열 , 시작지점 , 복사받을 배열, 시작지점, 복사할 배열을 얼만큼 복사할지
        System.arraycopy(arrN, 0, ans, 0, arrN.length);
        System.arraycopy(arrM, 0, ans, arrN.length, arrM.length);

        Arrays.sort(ans);

        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }



    }
}
