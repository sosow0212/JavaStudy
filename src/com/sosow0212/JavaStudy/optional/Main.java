package com.sosow0212.JavaStudy.optional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        Option option = new Option(java.util.Optional.of("d"), "success");

        option.getData().orElseThrow(() -> {
            return new IllegalArgumentException("hi");
        });

        System.out.println(option.toString());
    }
}
