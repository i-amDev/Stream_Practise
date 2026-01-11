package com.learning.Easy;

import java.util.Arrays;
import java.util.List;

public class FlattenLists {

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8),
                Arrays.asList(9, 10)
        );

        List<Integer> result = listOfLists
                .stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flatten list : " + result);

    }
}
