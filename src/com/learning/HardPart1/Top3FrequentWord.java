package com.learning.HardPart1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top3FrequentWord {

    public static void main(String[] args) {

        String string = "Java is great. Java is object oriented programming language. Java streams are powerful.";

        Stream<String> stream = Arrays.stream(string.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split(" "));

        stream.forEach(System.out::println);

        Map<String, Long> map = Arrays.stream(string.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        List<String> ans = Arrays.stream(string.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(ans);
    }
}
