package com.company.examples.module2.ex015_generic;

public interface Calculator<T> {

    T sum(T a, T b);
    T mult(T a, T b);

}