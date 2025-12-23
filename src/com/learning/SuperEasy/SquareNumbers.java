package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers
                .stream()
                .map(num -> num * num) // Intermediate Operation.
                .collect(Collectors.toList()); // Terminal Operation.

        System.out.println("Squares of each numbers are : " + result);

    }
}
