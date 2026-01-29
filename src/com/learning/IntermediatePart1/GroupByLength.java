package com.learning.IntermediatePart1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Tony", "Steve", "Bruce", "Peter", "May", "Bob");

        Map<Integer, List<String>> output = list
                .stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(output);
    }
}
