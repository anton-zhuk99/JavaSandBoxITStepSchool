package com.company.examples.module2.ex011_interfaces2;

public class Triangle implements Figure {

    private String colour;
    private String colourValue;

    public Triangle(String colour, String colourValue) {
        this.colour = colour;
        this.colourValue = colourValue;
    }

    public void displayInfo() {
        System.out.println("Colour : " + colour);
        System.out.println("ColourValue : " + colourValue);
    }

//    @Override
//    public String getColourName() {
//        return colour;
//    }
//
//    @Override
//    public String getHexNumber() {
//        return colourValue;
//    }
//
//    @Override
//    public void draw() {
//        System.out.println("Triangle drown.");
//    }
//
//    @Override
//    public void erase() {
//        System.out.println("Triangle erased.");
//    }
}
