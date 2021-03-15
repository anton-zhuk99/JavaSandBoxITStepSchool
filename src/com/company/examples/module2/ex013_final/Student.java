package com.company.examples.module2.ex013_final;

public final class Student {

    private final String name;
    private final String speciality;
    private final String group;

    public Student(final String name, final String speciality, final String group) {
        this.name = name;
        this.speciality = speciality;
        this.group = group;
    }

    public final void introduce() {
        System.out.println("Hello! My name is " + name + " and I'm a student of " + group + ". I'm studying " + speciality + ".");
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGroup() {
        return group;
    }
}