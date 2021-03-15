package com.company.examples.module2.ex011_interfaces2;

public interface Drawable {

    static void sayHello() {
        System.out.println("Hello World");
    }

    default void draw() {
        System.out.println("Something is drown.");
    }
    void erase();


}
