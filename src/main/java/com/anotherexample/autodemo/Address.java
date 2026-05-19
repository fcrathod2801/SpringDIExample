package com.anotherexample.autodemo;

public class Address {
    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    void display(){
        System.out.println("City: "+city);
    }
}
