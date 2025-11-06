package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sum = numbers
                .stream()
                .reduce(0, (a, b) -> a + b);// Terminal Operation

        Integer product = numbers
                .stream()
                .reduce(1, (a, b) -> a * b);// Terminal Operation

        System.out.println("Sum of all numbers is : " + sum);
        System.out.println("Product of all numbers is : " + product);
    }
}
