package com.learning.HardPart2;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {

    public static void main(String[] args) {

        String string = "Java is great and Java is fun. Java is powerful!";

        String[] arr = string.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split(" ");

        List<String> list = IntStream.range(0, arr.length - 1)
                .mapToObj(i -> arr[i] + " " + arr[i + 1])
                .toList();

        System.out.println(list);

        Map<String, Long> ans = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(ans);

    }
}
