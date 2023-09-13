package com.abg.ibc.garage.TeamsNotifier.model;


import lombok.Data;

@Data
public class CheckoutDetails {

    private String reservationNumber;
    private String name;
    private String address;
    private String number;
    private CarGroup carGroup;
    private String insuranceCost;

    private String mva;

    public CheckoutDetails() {
    }

    public CheckoutDetails(String reservationNumber, String name, String address, String number, CarGroup carGroup, String insuranceCost, String mva) {
        this.reservationNumber = reservationNumber;
        this.name = name;
        this.address = address;
        this.number = number;
        this.carGroup = carGroup;
        this.insuranceCost = insuranceCost;
        this.mva = mva;
    }

    public enum CarGroup{
        A,
        B,
        C,
        D
    }


}

