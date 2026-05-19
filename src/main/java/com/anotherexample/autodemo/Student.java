package com.anotherexample.autodemo;

public class Student {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    private Address address;
    void display(String name){
        address.display();
        System.out.println("Name: "+name);
    }

}
