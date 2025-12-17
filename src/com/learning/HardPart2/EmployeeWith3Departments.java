package com.learning.HardPart2;

import com.learning.IntermediatePart1.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeWith3Departments {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Tony", 50000, 60, "HR"),
                new Employee(102, "Steve", 35000, 80, "IT"),
                new Employee(103, "Bruce", 80400, 55, "Finance"),
                new Employee(104, "Peter", 125000, 25, "HR"),
                new Employee(105, "Thor", 23000, 235, "Finance"),
                new Employee(105, "Tony", 56000, 45, "IT"),
                new Employee(105, "Steve", 17500, 32, "Finance"),
                new Employee(105, "Tony", 76000, 19, "IT")
        );

        Map<String, List<Employee>> output = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getName));

        System.out.println(output);

        List<String> ans = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getName))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() >= 3)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(ans);
    }
}
