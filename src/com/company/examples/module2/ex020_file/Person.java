package com.company.examples.module2.ex020_file;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    private String passportSeries;
    private String passportNumber;
    private int acquirePlaceId;
    private long taxPayerNumber;

    private String street;
    private int houseNumber;
    private int floor;
    private String flatNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getAcquirePlaceId() {
        return acquirePlaceId;
    }

    public void setAcquirePlaceId(int acquirePlaceId) {
        this.acquirePlaceId = acquirePlaceId;
    }

    public long getTaxPayerNumber() {
        return taxPayerNumber;
    }

    public void setTaxPayerNumber(long taxPayerNumber) {
        this.taxPayerNumber = taxPayerNumber;
    }

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
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", acquirePlaceId=" + acquirePlaceId +
                ", taxPayerNumber=" + taxPayerNumber +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", floor=" + floor +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}
