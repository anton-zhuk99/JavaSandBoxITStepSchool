package com.company.examples.module2.lesson_05_04_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static void creationExample() {
        Set<String> set = Set.of("first", "second", "third");
        Stream<String> stream1 = set.stream();

        Stream<String> stream2 = Stream.empty();

        Stream<String> stream3 = Stream.of("first", "second", "third");

        String[] stringArr = {"first", "second", "third"};
        Stream<String> stream4 = Arrays.stream(stringArr);
    }

    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "1234567");
        String reduction = list.stream()                 // Stream<String>: "first", "second", "third"
                //.map(s -> s.length()) // Stream<Integer>: 5, 6, 5
                //.filter(i -> i > 5)
                //.sorted((s1, s2) -> s1.length() - s2.length()) // Comparator
                .reduce("Identity", (s1, s2) -> s1 + ", " + s2);
        System.out.println(reduction);
        List<String> sortedList = list.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());

        Optional<String> min = list.stream()
                .min((s1, s2) -> s1.length() - s2.length());
        String minimalString = min.get();
    }

}
