package com.learning.HardPart2;

import com.learning.IntermediatePart1.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryRangeGrouping {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Tony", 50000, 60, "HR"),
                new Employee(102, "Steve", 35000, 80, "IT"),
                new Employee(103, "Bruce", 80400, 55, "Finance"),
                new Employee(104, "Peter", 125000, 25, "HR"),
                new Employee(105, "Thor", 23000, 235, "Finance")
        );

        Map<SalaryRange, List<Employee>> output = employees
                .stream()
                .collect(Collectors.groupingBy(e -> getSalaryRange(e)));

        System.out.println(output);

    }

    private static SalaryRange getSalaryRange(Employee e) {
        if (e.getSalary() <= 50000) return SalaryRange.LOW;
        if (e.getSalary() > 50000 && e.getSalary() <= 100000) return SalaryRange.MEDIUM;
        else return SalaryRange.HIGH;
    }
}
