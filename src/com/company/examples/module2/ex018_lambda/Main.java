package com.company.examples.module2.ex018_lambda;

import java.text.SimpleDateFormat;

public class Main {

    static void acceptBinaryOp(BinaryOperation binaryOperation) {
        //
    }

    public static void main(String[] args) {
        // n! = n * (n-1) * (n-2) * ... * 2 * 1
        // 5! = 5 * 4 * 3 * 2 * 1
        BinaryOperation multiplication = ( arg1,  arg2) -> arg1 * arg2;
        BinaryOperation division = (arg1, arg2) -> arg1 / arg2;

        AnotherClass anotherClass = new AnotherClass();
        BinaryOperation simpleAddition = anotherClass::simpleSum;
        // Function, Consumer, Supplier, Predicate
        BinaryOperation staticAddition = AnotherClass::staticSum;

        System.out.println(simpleAddition.apply(2, 2));
        System.out.println(multiplication.apply(2.0, 2.0));
    }

}
