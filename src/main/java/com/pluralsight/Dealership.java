package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    // TODO: Create the method
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double mac){
        return null;
    }

    // TODO: Create the method
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    // TODO: Create the method
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    // TODO: Create the method
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    // TODO: Create the method
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }

    // TODO: Create the method
    public ArrayList<Vehicle> getVehiclesByType(String type){
        return null;
    }

    // TODO: Create the method
    public ArrayList<Vehicle> getAllVehicle(){
        return this.inventory;
    }

    // DONE: Create the method
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }

    // TODO: Create the method
    public void removeVehicle(Vehicle vehicle){
    }


    // region getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    // endregion
}
