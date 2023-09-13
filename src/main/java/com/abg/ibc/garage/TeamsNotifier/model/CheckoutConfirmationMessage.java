package com.abg.ibc.garage.TeamsNotifier.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CheckoutConfirmationMessage {

    private String transactionAmount;
    private boolean checkoutSuccessful;
    private String confirmationNumber;

    private String mva;

    public CheckoutConfirmationMessage(String transactionAmount, boolean checkoutSuccessful, String confirmationNumber, String mva) {
        this.transactionAmount = transactionAmount;
        this.checkoutSuccessful = checkoutSuccessful;
        this.confirmationNumber = confirmationNumber;
        this.mva = mva;
    }

    public CheckoutConfirmationMessage() {
    }
}
