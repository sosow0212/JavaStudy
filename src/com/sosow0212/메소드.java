package com.sosow0212;

public class 메소드 {

    public int sum(int a, int b) {
        return a+b;
    }

    public int vartest(int a) {
        a++;
        return a;
    }

    public void vartest2(int b) {
        b++;
    }

    public static void main(String[] args) {
        메소드 test = new 메소드();
        System.out.println(test.sum(1,2));

        int a = 10;
        int b = 10;
        a = test.vartest(a);
        test.vartest2(b);

        System.out.println(a);
        System.out.println(b);
    }
}
