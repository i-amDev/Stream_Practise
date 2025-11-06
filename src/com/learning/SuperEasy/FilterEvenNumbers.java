package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers
                .stream()
                .filter(num -> num % 2 == 0) // Intermediate Operation.
                .collect(Collectors.toList()); // Terminal Operation.

        System.out.println("Even numbers are : " + result);
    }
}
