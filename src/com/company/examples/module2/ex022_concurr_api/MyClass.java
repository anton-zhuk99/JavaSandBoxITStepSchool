package com.company.examples.module2.ex022_concurr_api;

public class MyClass {

    int field1;
    String field2;
    static double pi;

    // static-init-block => init-block => constructor

    static {
        System.out.println("Static init block 2");
    }

    static {
        System.out.println("Static init block 1");
    }

    {
        System.out.println("Init block.");
    }

    public MyClass() {
        System.out.println("Constructor.");
    }

}
