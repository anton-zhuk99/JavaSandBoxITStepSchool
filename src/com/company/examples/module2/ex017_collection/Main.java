package com.company.examples.module2.ex017_collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Ukraine");
        countries.add("China");
        countries.add("India");
        countries.add("Pakistan");

        var iterator = countries.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }

}