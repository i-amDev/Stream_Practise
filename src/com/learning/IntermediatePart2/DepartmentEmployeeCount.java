package com.learning.IntermediatePart2;

import com.learning.IntermediatePart1.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployeeCount {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Tony", 50000, 60, "HR"),
                new Employee(102, "Steve", 35000, 80, "IT"),
                new Employee(103, "Bruce", 80400, 55, "Finance"),
                new Employee(104, "Peter", 125000, 25, "HR"),
                new Employee(105, "Thor", 23000, 235, "Finance"),
                new Employee(106, "Wanda", 67000, 35, "Operations")
        );

        Map<String, Long> output = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(output);

        List<Map.Entry<String, Long>> list = output
                .entrySet()
                .stream()
                .filter(e -> e.getValue() >= 2)
                .toList();

        List<String> deptList = output
                .entrySet()
                .stream()
                .filter(e -> e.getValue() >= 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);
        System.out.println(deptList);

        List<String> ans = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() >= 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(ans);

    }
}
