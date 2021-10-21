package com.sosow0212.이론;

import java.util.ArrayList;

/**
 *  for (type var: iterate) {
 *      body-of-loop
 *   }
 */


public class for_each {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(number);
        }


        ArrayList<String> numbers2 = new ArrayList<String>();
        numbers2.add("one");
        numbers2.add("two");
        numbers2.add("three");

        for(String number: numbers2) {
            System.out.println(number);
        }
    }
}
