package com.sosow0212;

import java.util.List;
import java.util.Set;

public class check {
    public static void main(String[] args) {
        Set<Integer> a = Set.of(3, 1, 2);
        Set<Integer> b = Set.of(1, 2, 3);

        System.out.println(a.equals(b));
    }
}
