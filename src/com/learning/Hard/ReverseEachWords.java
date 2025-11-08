package com.learning.Hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWords {

    public static void main(String[] args) {

        String string = "Java streams are powerful";

        String result = Arrays.stream(string.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);

        String ans = Arrays.stream(string.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (rev, ch) -> ch + rev))
                .collect(Collectors.joining(" "));

        System.out.println(ans);
    }
}
