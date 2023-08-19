package com.techreturners.exercise002;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final int age;

    public Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}

