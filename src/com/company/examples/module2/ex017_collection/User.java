package com.company.examples.module2.ex017_collection;

import java.util.HashMap;
import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // obj1 and obj2
    // 1. у одного объекта -- одинаковый хэшкод
    // 2. obj1.equals(obj2) == true => obj1.hashCode() == obj2.hashCode()
    // 3. obj1.hashCode() == obj2.hashCode() ?=> obj1.equals(obj2) == true
    // 4. obj1.hashCode() != obj2.hashCode() !=> obj1.equals(obj2) == false
    // int - 2^32

    @Override
    public int hashCode() {
//        int prime = 29;
//        int result = 1;
//        result = result * prime + name.hashCode();
//        result = result * prime + age;
//        return result;
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        // instanceof
        if (obj instanceof User) {
            User user = (User) obj; // ClassCastException
            return this.name.equals(user.name) && this.age == user.age;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(User o) {
        return 0;
    }
}
