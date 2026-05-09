package com.beanexample;


public class Student {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }
}