package com.company.examples.module2.ex015_generic;

public class IntegerCalculator implements Calculator<Integer> {
    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    } // Byte, Short, Integer, Long, Character: + - * / % > <
    // Double, Float: + - * /
    // Boolean: & | ^
    // && ||
    // wrapper

    @Override
    public Integer mult(Integer a, Integer b) {
        return a * b;
    }
}
