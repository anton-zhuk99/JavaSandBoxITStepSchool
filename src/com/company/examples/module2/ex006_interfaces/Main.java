package com.company.examples.module2.ex006_interfaces;

public class Main {

    private static void driveBack(Vehicle vehicle) {
        vehicle.driveBackwards();
    }

    public static void main(String[] args) {
        Vehicle volkswagen = new Volkswagen();
        driveBack(volkswagen);
    }

}
