package com.sosow0212.JavaStudy.optional;

import java.util.Optional;

public class Option {
    public Optional<?> data;
    public String result;

    public Option(Optional<?> data, String result) {
        this.data = data;
        this.result = result;
    }

    public Optional<?> getData() {
        return data;
    }

    public void setData(Optional<?> data) {
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Option{" +
                "data=" + data +
                ", result='" + result + '\'' +
                '}';
    }
}
