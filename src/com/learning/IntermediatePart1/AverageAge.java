package com.learning.IntermediatePart1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageAge {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Tony", 50000, 60, "HR"),
                new Employee(102, "Steve", 35000, 80, "IT"),
                new Employee(103, "Bruce", 80400, 55, "Finance"),
                new Employee(104, "Peter", 125000, 25, "HR"),
                new Employee(105, "Thor", 23000, 235, "Finance")
        );

        OptionalDouble result = employees
                .stream()
                .mapToInt(Employee::getAge)
                .average();

        double average = employees
                .stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);

        System.out.println("Average age is : " + result.getAsDouble());
        System.out.println("Average age is : " + average);
    }
}
