package com.sosow0212.JavaStudy.staticFactoryMethod;

public class Laptop {

    private final String name;
    private final String company;
    private final String cpu;

    private Laptop(final String name, final String company, final String cpu) {
        this.name = name;
        this.company = company;
        this.cpu = cpu;
    }

    public static Laptop createGlam() {
        return new Laptop("글램", "LG", "intel");
    }

    public static Laptop createMacbook() {
        return new Laptop("맥북", "Apple", "intel");
    }

    public static Laptop createMacbookWithAppleSilicon() {
        return new Laptop("맥북", "Apple", "Apple Silicon");
    }
}
