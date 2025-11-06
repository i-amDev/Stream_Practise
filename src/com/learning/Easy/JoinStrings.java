package com.learning.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Apricot", "Mango", "Avocado");

        String result = fruits
                .stream()
                .collect(Collectors.joining());

        String ans = fruits
                .stream()
                .collect(Collectors.joining(", "));

        System.out.println("All strings combined in a single string : " + result);
        System.out.println("All strings combined in a single comma separated string : " + ans);
    }
}
