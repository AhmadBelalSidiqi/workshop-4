package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManger {
    public static Dealership getDealership(){
        Dealership dealership;
        Vehicle vehicle;
        String fileLocation ="src/main/resources/inventory.csv";
        try {
            FileReader fileReader = new FileReader(fileLocation);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String currentLine = bufferedReader.readLine();
            dealership = createDealershipObject(currentLine);
            while ((currentLine = bufferedReader.readLine()) != null){
                vehicle = createVehicle(currentLine);
                dealership.addVehicle(vehicle);
            }
            return dealership;


        } catch (IOException e) {
            System.err.println("Wrong file location: "+fileLocation+" "+e);
        }
        return null;

    }

    private static Vehicle createVehicle(String currentLine) {
        String[] lineSpilt = currentLine.split("\\|");
        int vin = Integer.parseInt(lineSpilt[0]);
        int year = Integer.parseInt(lineSpilt[1]);
        String make = lineSpilt[2];
        String model = lineSpilt[3];
        String type = lineSpilt[4];
        String color = lineSpilt[5];
        int odometer = Integer.parseInt(lineSpilt[6]);
        double price = Double.parseDouble(lineSpilt[7]);
        return new Vehicle(vin,year,make,model,type,color,odometer,price);
    }

    //TODO : Create the method
    public static void  saveDealership(Dealership dealerShip){

    }
    private static Dealership createDealershipObject(String line){
        String[] nameAddressNumber = line.split("\\|");
        String name = nameAddressNumber[0];
        String address = nameAddressNumber[1];
        String phoneNumber = nameAddressNumber[2];

        return new Dealership(name,address,phoneNumber);

    }
}
