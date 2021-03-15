package com.company.examples.module2.ex012_inner;

public class Main {

    static void innerClassExample() {
        Airplane airplane = new Airplane("Lufthansa", "LF-001", "Berlin-Kyiv");
        Airplane.Wing wing = airplane.new Wing("RED", "SW-2000");
    }

    static void staticClassExample() {
        Building.Shop shop = new Building.Shop("Varus", "adress str, 42");
    }

    static void localClassExample() {
        Person person = new Person("Nikita", "Sholohova", "17");
        person.getAddress();
    }

    static void anonClassExample() {
        Animal tiger = new Animal() {
            @Override
            public void voice() {
                System.out.println("Rrrrr!");
            }
            @Override
            public void introduce() {
                System.out.println("I am a tiger :)");
            }
        };
        Animal cat = new Animal() {
            @Override
            public void voice() {
                System.out.println("meow");
            }

            @Override
            public void introduce() {
                System.out.println("I am a cat.");
            }
        };
        cat.voice();
        cat.introduce();
        tiger.voice();
        tiger.introduce();
    }

    public static void main(String[] args) {
        anonClassExample();
    }

}