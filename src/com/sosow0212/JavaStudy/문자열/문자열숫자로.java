package com.sosow0212.JavaStudy.문자열;

public class 문자열숫자로 {
    public static void main(String[] args) {
        String str = "12345";
        int[] arr = new int[str.length()];

        // 문자열에 있는 문자로된 숫자를 각각의 int형 정수로 변환하기
        for(int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        // int형 정수로 변환시킨 문자열들을 숫자로 출력하기
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
            // 1 2 3 4 5
        }

        System.out.println();

        System.out.println(arr[0] + arr[1]);
        // 숫자로 잘 전환되었기 때문에 3이 출력된다.



        // 입력 12345
        // 출력 1 2 3 4 5
        // 출력 3
    }
}
