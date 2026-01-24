package com.learning.HardPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {

    public static void main(String[] args) {

        List<Character> characters = Arrays.asList('A', '0', 'z', '!', 'B', 'x', '$');

        Map<CharCategory, List<Character>> output = characters
                .stream()
                .collect(Collectors.groupingBy(ch -> {
                    if (ch >= 'A' && ch <= 'Z') return CharCategory.UPPERCASE;
                    if (ch >= 'a' && ch <= 'z') return CharCategory.LOWERCASE;
                    if (ch >= '0' && ch <= '9') return CharCategory.DIGIT;
                    else return CharCategory.OTHER;
                }));

        System.out.println(output);

        Map<CharCategory, List<Character>> ans = characters
                .stream()
                .collect(Collectors.groupingBy(ch -> {
                    if (Character.isUpperCase(ch)) return CharCategory.UPPERCASE;
                    if (Character.isLowerCase(ch)) return CharCategory.LOWERCASE;
                    if (Character.isDigit(ch)) return CharCategory.DIGIT;
                    else return CharCategory.OTHER;
                }));

        System.out.println(ans);

    }
}
