package com.company.examples.module2.ex004_polym;

public class Main {

    static void openBox(Box box) {
        box.open();
    }

    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox();
        MoneyBox moneyBox = new MoneyBox();
        openBox(heavyBox);
        openBox(moneyBox);
    }
}