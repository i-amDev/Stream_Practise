package com.learning.HardPart1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestWordFinder {

    public static void main(String[] args) {

        String string = "The quick, brown fox jumped over the lazy dog!";

        Stream<String> stream = Arrays.stream(
                string.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "));

        stream.forEach(System.out::println);

        String ans = Arrays.stream(
                        string.toLowerCase()
                                .replaceAll("[^a-z\\s]", "")
                                .split(" "))
                .max(Comparator.comparing(String::length))
                .orElse("");

        System.out.println("Longest word is : " + ans);
    }
}
