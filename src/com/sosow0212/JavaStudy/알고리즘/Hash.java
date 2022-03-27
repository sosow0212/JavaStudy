package com.sosow0212.JavaStudy.알고리즘;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"a", "a", "b", "c", "c"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String str : arr) {
            hashMap.put(str, 1);
        }

        System.out.println(hashMap.get("1"));


    }
}
