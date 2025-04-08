package com.bridgelabz;

public class Student{
    int id;
    String name;
    int age;

    public int id() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int age() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}
