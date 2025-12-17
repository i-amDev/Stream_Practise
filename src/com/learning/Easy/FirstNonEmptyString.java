package com.learning.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("", "Banana", "Apricot", "Mango", "Avocado");

        Optional<String> result = fruits
                .stream()
                .filter(str -> !str.isEmpty())
                .findFirst();

        System.out.println("First non empty string is : " + result.get());
    }
}
