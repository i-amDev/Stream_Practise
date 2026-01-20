package com.learning.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLists {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(7, 3, 10, 2, 6, 5, 4, 8, 9, 1);

        List<Integer> ascendingOrder = numbers
                .stream()
                .sorted()
                .toList();

        List<Integer> descendingOrder = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Sorted in ascending order : " + ascendingOrder);
        System.out.println("Sorted in descending order : " + descendingOrder);

    }
}
