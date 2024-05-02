package com.driver;

// Car class, inheriting from Vehicle
public class Car extends Vehicle {
    private int numDoors;

    public Car(String name, int numDoors) {
        super(name);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}
