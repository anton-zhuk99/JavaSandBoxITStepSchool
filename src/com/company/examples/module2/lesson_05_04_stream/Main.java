package com.company.examples.module2.lesson_05_04_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        Set<String> set = Set.of("first", "second", "third");
        Stream<String> stream1 = set.stream();

        Stream<String> stream2 = Stream.empty();

        Stream<String> stream3 = Stream.of("first", "second", "third");

        String[] stringArr = {"first", "second", "third"};
        Stream<String> stream4 = Arrays.stream(stringArr);
    }

}
