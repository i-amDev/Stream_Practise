package com.learning.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalDouble average = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .average();

        double result = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of all numbers is : " + average.getAsDouble());
        System.out.println("Average of all numbers is : " + result);
    }

}
