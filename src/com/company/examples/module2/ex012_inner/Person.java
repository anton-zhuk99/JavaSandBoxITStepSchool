package com.company.examples.module2.ex012_inner;

public class Person {
    private String name;
    private String street;
    private String house;

    public Person(String name, String street, String house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }

    public void getAddress() {

        class AddressContainer {
            private String street;
            private String house;

            public AddressContainer() {
                this.street = Person.this.street;
                this.house = Person.this.house;
            }

            public void printAddress() {
                System.out.println(this.street + " " + this.house);
            }
        }

        AddressContainer addressContainer = new AddressContainer();
        addressContainer.printAddress();

    }

    // getters/setters
}