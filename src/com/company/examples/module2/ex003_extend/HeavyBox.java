package com.company.examples.module2.ex003_extend;

public class HeavyBox extends Box {

    private int weight;

    public HeavyBox(int weight, int width, int height, int depth) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public int volume() {
        return width * height * depth;
    }

    public void newMethod() {}

}
