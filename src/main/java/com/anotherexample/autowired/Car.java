package com.anotherexample.autowired;



public class Car {

    //this is part injection by setter method, we can also do it by constructor or field injection
    private Engine engine;



    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public void drive() {

        engine.start();

        System.out.println("Car Running");
    }
}