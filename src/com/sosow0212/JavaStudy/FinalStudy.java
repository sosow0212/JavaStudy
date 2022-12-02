package com.sosow0212.JavaStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalStudy {

    public static void main(String[] args) {
        Domain domain = new Domain(List.of(1, 2, 3));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(domain.getNumbers());
            String choice = sc.next();
            if (choice.equals("R")) {
                domain = new Domain(List.of(2, 3, 4));
            }
        }
    }
}
