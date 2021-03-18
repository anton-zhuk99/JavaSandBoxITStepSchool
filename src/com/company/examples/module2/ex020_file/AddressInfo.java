package com.company.examples.module2.ex020_file;

import java.io.Serializable;

public class AddressInfo implements Serializable {

    private static final long serialVersionUID = 4L;

    private String street;
    private int houseNumber;
    private int floor;
    private String flatNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", floor=" + floor +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}
