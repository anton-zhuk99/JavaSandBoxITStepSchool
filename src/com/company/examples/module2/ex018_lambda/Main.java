package com.company.examples.module2.ex018_lambda;

import com.company.examples.module2.ex010_constrdemo.B;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.*;

public class Main {

    static double weight = 2.0;

    static void binaryOperationExample() {
        BinaryOperation<Double> multiplication = ( arg1,  arg2) -> arg1 * arg2;
        BinaryOperation<Integer> division = (arg1, arg2) -> arg1 / arg2;

        AnotherClass anotherClass = new AnotherClass();
        BinaryOperation<Double> simpleAddition = anotherClass::simpleSum;

        BinaryOperation<Double> staticAddition = AnotherClass::staticSum;

        System.out.println(simpleAddition.apply(2.0, 2.0));
        System.out.println(multiplication.apply(2.0, 2.0));
        System.out.println(division.apply(5, 2));
    }

    static void constructorRefExample() {
        LambdaEmptyBoxCreator boxCreator = Box::new;
        LambdaBoxCreator fullBoxCreator = Box::new;

        Box emptyBox = boxCreator.create(); // new Box()
        Box fullBox = fullBoxCreator.create(24.0); // new Box(24.0)
    }

    static void predicateExample() {
        Predicate<Integer> isEven = i -> i % 2 == 0;
        Predicate<Integer> isPositive = i -> i > 0;
        boolean result1 = isEven.and(isPositive).test(6);
        boolean result2 = isEven.or(isPositive).test(-5);
        boolean isOdd = isEven.negate().test(5);
    }

    static void functionExample() {
        Function<Double, Double> evaluateSquareRoot = x -> Math.sqrt(x);
        Function<Double, Double> evaluateAbsoluteValue = x -> Math.abs(x);
        double result = evaluateAbsoluteValue.andThen(evaluateSquareRoot).apply(-4.0);
        System.out.println(result);
    }

    static void supplierExample() {
        Supplier<Box> getBox = () -> new Box(weight);
    }

    static void consumerExample() {
        Consumer<Box> lambdaToConsole = box -> System.out.println("This box weights " + box.getWeight() + " kg.");
        Consumer<Box> changeBox = box -> box.setWeight(box.getWeight() + 1.0);
        Box box = new Box(weight);
        lambdaToConsole.andThen(changeBox).andThen(lambdaToConsole).accept(box);
    }

    public static void main(String[] args) {

    }

}