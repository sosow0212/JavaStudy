package com.sosow0212.JavaStudy;

import java.util.List;

public class Domain {
    private final List<Integer> numbers;

    public Domain(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
