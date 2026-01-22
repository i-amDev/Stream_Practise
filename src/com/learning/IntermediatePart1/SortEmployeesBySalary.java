package com.learning.IntermediatePart1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Tony", 50000, 60, "HR"),
                new Employee(102, "Steve", 35000, 80, "IT"),
                new Employee(103, "Bruce", 80400, 55, "Finance"),
                new Employee(104, "Peter", 125000, 25, "HR"),
                new Employee(105, "Thor", 23000, 235, "Finance")
        );

        List<Employee> ascendingOrder = employees
                .stream()
                .sorted(Comparator.comparing(emp -> emp.getSalary()))
                .toList();

        List<Employee> descendingOrder = employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        System.out.println("Employees sorted in ascending according to their salary : " + ascendingOrder);
        System.out.println("Employees sorted in descending according to their salary : " + descendingOrder);
    }
}
