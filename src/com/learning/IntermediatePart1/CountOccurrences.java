package com.learning.IntermediatePart1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrences {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("bat", "ball", "stumps", "ball", "stumps", "ball");

        Map<String, Long> output = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(output);

    }
}
