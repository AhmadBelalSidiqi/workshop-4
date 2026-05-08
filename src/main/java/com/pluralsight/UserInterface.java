package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
    }

    public void display(){
        inti();
        Scanner scanner = new Scanner(System.in);
        String menu = """
                Welcome to our Dealership
                Please chose one of the following options
                A) Get Vehicles by price
                B) Get Vehicles by make and model
                C) Get Vehicles by year
                D) Get Vehicles by Mileage
                E) Get Vehicles by vehicle type
                F) Get All Vehicles
                G) Add Vehicles
                H) Remove Vehicles
                X) Exit the Program""";
        boolean running = true;
        while (running){
            String userInput = scanner.nextLine();
            switch (userInput.toUpperCase()){
                case "A"->
                    processGetByPriceRequest();
                case "B"->
                    processGetByMakeModeRequest();
                case "C"->
                    processGetByYearRequest();
                case "D"->
                    processGetByMileageRequest();
                case "E"->
                    processGetByVehicleTypeRequest();
                case "F"->
                    processGetAllVehiclesRequest();
                case "G"->
                    processAddVehicleRequest();
                case "H" ->
                    processRemoveVehicleRequest();
                case "X"->
                    running = false;
                default ->
                        System.err.println("Wrong Input.");
            }

        }

    }
    private void inti(){
        this.dealership = DealershipFileManger.getDealership();
    }
    public void processGetByPriceRequest(){}
    public void processGetByMakeModeRequest(){}
    public void processGetByYearRequest(){}
    public void processGetByMileageRequest(){}
    public void processGetByVehicleTypeRequest(){}
    public void processGetAllVehiclesRequest(){}
    public void processAddVehicleRequest(){}
    public void processRemoveVehicleRequest(){}

    private void displayVehicles(ArrayList<Vehicle> vehicles){
        System.out.println("VIN|YEAR|MAKE|MODEL|TYPE|MILEAGE|PRICE");
        for(Vehicle vehicle : vehicles)
            System.out.println(vehicle);
    }

    public void processAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicle());
    }

}
