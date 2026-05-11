package com.factorypattern.example;

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("car")) {
            return new Car();
        }

        if(type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }
}