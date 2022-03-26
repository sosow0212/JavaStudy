package com.sosow0212.JavaStudy.알고리즘;

public class ReverseString {

    public static String reverse(String str, int index) {
        if (index == 0) {
            return str.charAt(0) + "";
        }
        char letter = str.charAt(index);
        return letter + reverse(str, index - 1);
    }

    public static void main(String[] args) {
        String str = "hello";
        String reverse = reverse(str, str.length() - 1);
        System.out.println(reverse);
    }
}
