package com.learning.Easy;

import java.util.Arrays;
import java.util.List;

public class CheckIfAnyNumberIsDivisibleBy {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 10);

        boolean result = numbers
                .stream()
                .anyMatch(num -> num % 3 == 0);

        System.out.println("Does any number is divisible by 3 : " + result);
    }
}
