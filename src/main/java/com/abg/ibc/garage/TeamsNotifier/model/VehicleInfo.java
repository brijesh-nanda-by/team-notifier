package com.abg.ibc.garage.TeamsNotifier.model;


import lombok.Data;

@Data
public class VehicleInfo {

    private String registrationNumber;
    private String mva;
    private CheckoutDetails.CarGroup carGroup;
    private String location;


    public VehicleInfo() {
    }

    public VehicleInfo(String registrationNumber, String mva, CheckoutDetails.CarGroup carGroup, String location) {
        this.registrationNumber = registrationNumber;
        this.mva = mva;
        this.carGroup = carGroup;
        this.location = location;
    }
}
