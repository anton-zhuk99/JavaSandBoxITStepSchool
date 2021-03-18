package com.company.examples.module2.ex020_file;

import java.io.Serializable;

// PATTERN BUILDER
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private PersonalInfo personalInfo;
    private PassportInfo passportInfo;
    private transient AddressInfo addressInfo;

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public Person setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
        return this;
    }

    public PassportInfo getPassportInfo() {
        return passportInfo;
    }

    public Person setPassportInfo(PassportInfo passportInfo) {
        this.passportInfo = passportInfo;
        return this;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public Person setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personalInfo=" + personalInfo +
                ", passportInfo=" + passportInfo +
                ", addressInfo=" + addressInfo +
                '}';
    }
}
