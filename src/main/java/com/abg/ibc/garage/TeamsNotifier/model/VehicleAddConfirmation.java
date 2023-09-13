package com.abg.ibc.garage.TeamsNotifier.model;


import lombok.Data;

@Data
public class VehicleAddConfirmation {

    private String confirmationNumber;
    private String mva;
    private String transactionId;

    public VehicleAddConfirmation() {
    }

    public VehicleAddConfirmation(String confirmationNumber, String mva, String transactionId) {
        this.confirmationNumber = confirmationNumber;
        this.mva = mva;
        this.transactionId = transactionId;
    }
}
