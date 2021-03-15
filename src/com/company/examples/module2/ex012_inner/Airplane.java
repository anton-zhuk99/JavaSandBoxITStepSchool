package com.company.examples.module2.ex012_inner;

public class Airplane {

    private String name;
    private String id;
    private String flight;
    private Wing leftWing;
    private Wing rightWing;

    public Airplane(String name, String id, String flight) {
        this.name = name;
        this.id = id;
        this.flight = flight;
        this.leftWing = new Wing("WHITE", "SW-2000");
        this.rightWing = new Wing("WHITE", "SW-2000");
    }

    public class Wing {
        private String color;
        private String model;

        public Wing(String color, String model) {
            this.color = color;
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void testOuterClass() {

        }
    }

    public void testInnerClass() {
        Wing wing = new Wing("RED", "SW-2000");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Wing getLeftWing() {
        return leftWing;
    }

    public void setLeftWing(Wing leftWing) {
        this.leftWing = leftWing;
    }

    public Wing getRightWing() {
        return rightWing;
    }

    public void setRightWing(Wing rightWing) {
        this.rightWing = rightWing;
    }
}
