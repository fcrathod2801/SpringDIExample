package com.factorypattern.example;

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}