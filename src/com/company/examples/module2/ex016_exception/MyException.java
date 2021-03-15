package com.company.examples.module2.ex016_exception;

public class MyException extends Exception {

    private String message;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
