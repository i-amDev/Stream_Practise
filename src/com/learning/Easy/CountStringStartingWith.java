package com.learning.Easy;

import java.util.Arrays;
import java.util.List;

public class CountStringStartingWith {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Apricot", "Mango", "Avocado");

        long result = fruits
                .stream()
                .filter(s -> s.startsWith("A"))
                .count();

        List<String> ans = fruits
                .stream()
                .filter(s -> s.startsWith("A"))
                .toList();

        System.out.println("No of fruits starting with A is : " + result);
        System.out.println("Those fruit(s) are : " + ans);
    }
}
