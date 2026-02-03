package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThan {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 24, 85, 6, 57, 8, 11, 100);

        Optional<Integer> result = numbers
                .stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst();// Terminal Operation

        System.out.println("First number greater than 10 is : " + result.get());
    }
}
