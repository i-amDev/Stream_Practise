package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 45, 4, 5, 6, 7, 8, 9, 10);

        Integer result = numbers
                .stream()
                .reduce(0, (a, b) -> Math.max(a, b));

        Integer ans = numbers
                .stream()
                .reduce(0, (a, b) -> Integer.max(a, b));

        Optional<Integer> max = numbers
                .stream()
                .reduce(Math::max);

        System.out.println("Maximum element is : " + result);
        System.out.println("Maximum element is : " + ans);
        System.out.println("Maximum element is : " + max.get());

    }
}
