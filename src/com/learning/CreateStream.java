package com.learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        // To convert a list into a stream.
        List<String> names = Arrays.asList("Tony", "Steve", "Bruce");
        Stream<String> stream = names.stream();

        // To convert an array into a stream.
        String[] arr = {"Tony", "Steve", "Bruce"};
        Stream<String> stream1 = Arrays.stream(arr);

        // Using Stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        // Using Stream generate
        Stream<String> limit = Stream.generate(() -> "Hello").limit(5);

    }
}
