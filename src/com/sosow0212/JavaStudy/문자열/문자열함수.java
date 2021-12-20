package com.sosow0212.JavaStudy.문자열;

public class 문자열함수 {
    public static void main(String[] args) {
        // replaceAll - 지정한 문자 > 새로운 문자로 교체
        String str = "AB CD";
        String replaceAll = str.replaceAll("\\p{Space}", "*");
        System.out.println("replaceAll: " + replaceAll);
        // 결과: AB*CD


        // split - 문자열 나누기 (배열로 반환)
        String str2 = "A:B:C:D:abcd";
        String[] split = str2.split(":"); // A,B,C,D,abcd
        System.out.println("split: " + split[1]);
        // 결과 B


        // substring - 문자열에 지정한 범위에 속하는 문자열 반환
        // 시작범위에 값은 포함하고, 끝나는 범위는 포함하지 않는다.
        // ex) str.substring(0,2) => 0,1 만 포함
        String str3 = "ABCDEF";
        String substring = str3.substring(0, 2);
        System.out.println("substring: " + substring);
        // 결과 AB


        // valueOf - 지정한 개체의 원시 값을 반환
        int i = 12345;
        long l = 1L;
        char c = '1';
        System.out.println("valueOf: " + String.valueOf(i));
        System.out.println("valueOf: " + String.valueOf(l));
        System.out.println("valueOf: " + String.valueOf(c));
        // 결과값: 12345 / 1 / 1


        // compareTo - 두개의 String을 순차적으로 비교하다가 틀린 부분이 있으면
        // 비교하는 String에 Char 값을 반환한다. (대소문자 구별)
        String str4 = "A";
        String str5 = "B";
        int compareTo = str4.compareTo(str5);
        if (compareTo > 0) {
            System.out.println(str4 + " > " + str5);
        } else if (compareTo == 0) {
            System.out.println(str4 + " = " + str5);
        } else {
            System.out.println(str4 + " < " + str5);
        }
        // 결과값: A<B


        // contains - 두 개의 String을 비교해서 비교대상 String을
        // 포함하고 있으면 true, 아니면 false를 반환한다.
        String str6 = "abcd";
        String str7 = "c";
        boolean contains = str6.contains(str7);
        System.out.println("contains: " + contains);
        // 결과: true
    }
}
