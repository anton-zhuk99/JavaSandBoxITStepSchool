package com.company.examples.module2.ex016_exception;

import java.util.Scanner;

public class Main {

    static void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print(): " + s);
    }

    static void usingTryCatchFinally() {
        String[] list = {"first", null, "third"};
        for (String s: list) {
            try {
                print(s);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            }
            finally {
                System.out.println("Inside block finally");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }
    }

    static void withoutTryCatchFinally() {
        String[] list = {"first", null, "third"};
        for (String s: list) {
            print(s);
        }
    }

    static void throwCheckedException() throws MyException {
        throw new MyException();
    }

    static void throwUncheckedException() {
        throw new RuntimeException("My own message");
    }

    public static void main(String[] args) {
        // try with resources
//        try (Scanner scanner = new Scanner(System.in)) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            double result = a / b;
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
        System.out.println("Code before exception.");
        try {
            throwUncheckedException();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Code after exception.");

    }
}
// 1. Создать свой класс исключения.
// 2. Выбросить и словить его же в примере.
// 3. try-with-resources