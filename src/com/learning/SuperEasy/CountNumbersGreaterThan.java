package com.learning.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class CountNumbersGreaterThan {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 24, 85, 6, 57, 8, 11, 100);

        long result = numbers
                .stream()
                .filter(n -> n > 50)
                .count(); // Terminal Operation

        System.out.println("Count of numbers greater than 50 is : " + result);

    }
}
