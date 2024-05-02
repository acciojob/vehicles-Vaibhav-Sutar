package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create a Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        System.out.println("Vehicle Name: " + vehicle.getVehicleName());

        // Create a Car
        Car car = new Car("Toyota Camry", 4);
        System.out.println("Car Name: " + car.getVehicleName());
        System.out.println("Number of Doors: " + car.getNumDoors());

        // Create an F1 Car
        F1 f1 = new F1("Mercedes F1 W13", 2, "Mercedes-AMG Petronas Formula One Team");
        System.out.println("F1 Car Name: " + f1.getVehicleName());
        System.out.println("Number of Doors: " + f1.getNumDoors());
        System.out.println("Team: " + f1.getTeam());

        // Create a Boat
        Boat boat = new Boat("Speedboat", 6);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}
