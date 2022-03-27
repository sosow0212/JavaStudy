package com.sosow0212.JavaStudy.알고리즘;

public class recur {
    public static int recursive(int n) {
        if(n == 0) {
            return 0;
        }
        System.out.println("나 실행됨 n = " + n);
        return n + recursive(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(recursive(n));

    }
}
