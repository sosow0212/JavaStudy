package com.sosow0212.JavaStudy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = generatorList();

        List<Integer> streamWithFilterList = list.stream()
                .map(i -> i + 10) // 10~110
                .filter(i -> i >= 50) // 50~110
                .filter(i -> i >= 105) // filter 여러개 적용 가능 // 105~110
                .sorted(Comparator.reverseOrder()) // 내림차순 // 110~105
                .collect(Collectors.toList());

        long streamWithCount = list.stream()
                .map(i -> i + 10)
                .filter(i -> i >= 50)
                .filter(i -> i >= 105) // filter 여러개 적용 가능
                .count(); // 요소의 개수 파악

        System.out.println(streamWithFilterList); // 110, 109 ... 105
        System.out.println(streamWithCount); // 6

    }

    public static List<Integer> generatorList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        return list;
    }
}
