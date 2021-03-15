package com.company.examples.module2.ex015_generic;

public class Storage<T extends Number> { // extends OR super

    private T value;

    public Storage(T value) {
        this.value = value;
    }

    public Storage() {
        
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}