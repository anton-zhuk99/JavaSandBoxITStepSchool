package com.company.examples.module2.ex009_extend2.sit1;

public class Triangle extends Figure {

    private String style;

    public Triangle(String style, double width, double height) {
        this.style = style;
        super.setHeight(height);
        super.setWidth(width);
    }

}
