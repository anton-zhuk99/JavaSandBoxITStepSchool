package com.company.examples.module2.ex006_interfaces;

public class Volkswagen implements Vehicle, Engine {

    @Override
    public void startEngine() {
        System.out.println("VW engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("VW engine stopped");
    }

    @Override
    public void driveBackwards() {
        System.out.println("VW is driving backwards.");
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
