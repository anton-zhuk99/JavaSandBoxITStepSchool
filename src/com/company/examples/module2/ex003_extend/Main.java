package com.company.examples.module2.ex003_extend;

public class Main {

    public static void main(String[] args) {
        Box box; // declare
        box = new MoneyBox(3, 4, 5, 6);
        System.out.println(box instanceof HeavyBox);
        System.out.println(box instanceof MoneyBox);
    }

}
