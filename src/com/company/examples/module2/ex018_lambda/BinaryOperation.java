package com.company.examples.module2.ex018_lambda;

@FunctionalInterface
public interface BinaryOperation<T> {

    T apply(T arg1, T arg2);

}
