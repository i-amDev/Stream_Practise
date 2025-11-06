package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of even numbers is : " + result);
    }
}
