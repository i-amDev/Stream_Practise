package com.learning.HardPart1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAverage {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Double> ans = IntStream.range(0, list.size() - 2)
                .mapToObj(index -> (list.get(index) + list.get(index + 1) + list.get(index + 2)) / 3.0)
                .toList();

        System.out.println(ans);

        int window = 4;

        List<Double> average = IntStream.range(0, list.size() - (window - 1))
                .mapToObj(index -> list.subList(index, index + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0))
                .toList();

        System.out.println(average);
    }
}
