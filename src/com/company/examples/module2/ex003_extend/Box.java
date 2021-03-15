package com.company.examples.module2.ex003_extend;

public abstract class Box {

    protected int width;
    protected int height;
    protected int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public abstract int volume();
}