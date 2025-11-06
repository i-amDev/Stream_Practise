package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfSquareOfEvenNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        Integer ans = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        Optional<Integer> sum = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(Integer::sum);

        System.out.println("Sum of square of even numbers is : " + result);
        System.out.println("Sum of square of even numbers is : " + ans);
        System.out.println("Sum of square of even numbers is : " + sum.get());
    }
}
