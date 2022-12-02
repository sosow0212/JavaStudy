package com.sosow0212.JavaStudy.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> test = List.of(1, 7, 5, 32, 6, 9, 6, 4, 3, 8, 4, 65, 5, 7);
        // 점수 상위 5명을 뽑는데, 이때 또 한 번 점수가 20점 이상인 애들만 출력하시오.

        List<Integer> answer = test.stream().filter(i->i>=20).limit(5).sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(answer);
    }
}
