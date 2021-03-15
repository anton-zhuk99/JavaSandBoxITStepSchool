package com.company.examples.module2.ex005_overload;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.sum(2, 2);
        double sum2 = calculator.sum(2.0, 2.0);
        long sum3 = calculator.sum(2L, 2L);
    }

}
