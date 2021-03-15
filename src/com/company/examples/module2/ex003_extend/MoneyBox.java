package com.company.examples.module2.ex003_extend;

public class MoneyBox extends Box {

    private int cost;

    public MoneyBox(int cost, int width, int height, int depth) {
        super(width, height, depth);
        this.cost = cost;
    }

    @Override
    public int volume() {
        return width * height * depth;
    }
}
