package com.learning.Easy;

import java.util.Arrays;
import java.util.List;

public class FindDistinctElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 6, 1, 5, 2, 56, 2, 100);

        List<Integer> result = numbers
                .stream()
                .distinct()
                .toList();

        System.out.println("List without duplicates : " + result);
    }
}
