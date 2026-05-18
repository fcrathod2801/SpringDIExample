package com.factorypattern.example;

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}