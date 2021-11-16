package com.sosow0212.알고리즘;

import java.util.Scanner;

/**
 * 이분탐색 (Binary Search)
 *
 * 시간 복잡도는 O(log n) 이다.
 *
 * 정렬된 배열 또는 리스트에 적합한 고속 탐색 방법이다.
 *
 * 배열의 중앙에 있는 값을 조사하여 찾고자 하는 항목이 왼쪽 또는 오른쪽 부분 배열에 있는지
 * 알아내어 탐색의 범위를 반으로 줄인다.
 *
 * 찾고자 하는 값이 속해있지 않은 부분은 전혀 고려할 필요가 없어서, 매 단계에서 검색해야 할
 * 리스트의 크기를 반으로 줄일 수 있다.
 *
 * 데이터의 삽입이나 삭제가 빈번할 시에는 적합하지 않고, 주로 고정된 데이터에 대한 탐색에 적합하다.
 *
 *
 * 이진 탐색의 구현은 다음과 같다.
 * 1. 배열을 정렬한다.
 * 2. 중간값을 구한다. mid = (low+high) / 2
 * 3. array[mid] 값과 구하고자 하는 key 값을 비교한다. 이때
 * key > mid : low = mid + 1 (왼쪽 반을 버림)
 * key < mid : high = mid -1 (오른쪽 반을 버림)
 * key == mid : 구하고자 하는 값을 찾음. -> 중간값 리턴
 * 4. low > high가 될 때까지 1~3번을 반복한다.
 */

public class 이분탐색 {

    static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 순환 호출을 이용한 이진 탐색");
        System.out.println(binarySearch1(5, 0, arr.length-1)); // 2

        System.out.println("\n2. 반복을 이용한 이진 탐색"); // 순환보다 효율적임
        System.out.println(binarySearch2(5, 0, arr.length-1)); // 2
    }

    // 재귀적 탐색
    static int binarySearch1(int key, int low, int high) {
        int mid;

        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) { // 탐색 성공
                return mid;
            } else if(key < arr[mid]) {
                return binarySearch1(key, low, mid-1); // 왼쪽 부분 탐색
            } else {
                return binarySearch1(key, mid+1, high); // 오른쪽 부분 탐색
            }
        }

        return -1; // 탐색 실패
    }


    // 반복적 탐색
    static int binarySearch2(int key, int low, int high) {
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // 탐색 실패
    }
}
