package com.learning.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 6, 1, 5, 2, 56, 2, 100);

        Optional<Integer> result = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second highest number is : " + result.get());

    }
}
