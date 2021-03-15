package com.company.examples.module2.ex012_inner;

public abstract class Building {
    private String name;
    private String address;
    private String type;

    Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static class Platform extends Building {
        public Platform(String name, String address) {
            super(name, address);
            setType("Platform");
        }

        // some additional logic
    }

    public static class House extends Building {
        public House(String name, String address) {
            super(name, address);
            setType("House");
        }

        // some additional logic
    }

    public static class Shop extends Building {
        public Shop(String name, String address) {
            super(name, address);
            setType("Shop");
        }

        // some additional logic
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}