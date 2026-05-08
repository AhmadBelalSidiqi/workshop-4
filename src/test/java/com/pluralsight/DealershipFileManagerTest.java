package com.pluralsight;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DealershipFileManagerTest {

    @org.junit.jupiter.api.Test
    void getDealership() {
        Dealership dealership = DealershipFileManager.getDealership();
        assert dealership != null;
        ArrayList<Vehicle> inventory = dealership.getAllVehicle();
        int actualSize = inventory.size();
        // As of now there are only 4 cars in the inventory.
        int expectedSize = 4;
        assertEquals(expectedSize,actualSize);

    }
}