package com.learning.HardPart1;

import com.learning.IntermediatePart1.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Tony", 50000, 60, "HR"),
                new Employee(102, "Steve", 35000, 80, "IT"),
                new Employee(103, "Bruce", 80400, 55, "Finance"),
                new Employee(104, "Peter", 125000, 25, "HR"),
                new Employee(105, "Thor", 23000, 235, "Finance"),
                new Employee(106, "Wanda", 67000, 35, "Operations")
        );

        Map<Character, Long> frequency = employees
                .stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);

        Character character = employees
                .stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();

        System.out.println(character);

    }
}
