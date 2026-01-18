package com.learning.HardPart2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSpendDay {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", LocalDate.of(2024, 1, 1), 300),
                new Transaction("T2", LocalDate.of(2024, 2, 10), 560),
                new Transaction("T3", LocalDate.of(2024, 8, 21), 590),
                new Transaction("T4", LocalDate.of(2024, 4, 17), 760),
                new Transaction("T5", LocalDate.of(2024, 1, 1), 480)
        );

        Map<LocalDate, Double> sum = transactions
                .stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)));

        System.out.println(sum);

        Map.Entry<LocalDate, Double> ans = transactions
                .stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(ans);

    }
}
