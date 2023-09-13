package com.abg.ibc.garage.TeamsNotifier.controller;


import com.abg.ibc.garage.TeamsNotifier.model.CheckoutConfirmationMessage;
import com.abg.ibc.garage.TeamsNotifier.model.CheckoutDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {


    @PostMapping("/complete/{reservationId}")
    public CheckoutConfirmationMessage completeCheckout(@PathVariable String reservationId , @RequestParam(name = "") String location,
                                       @RequestBody CheckoutDetails payload) {
        return new CheckoutConfirmationMessage("1345nadvgdv125" , true , "8765cg567" , "RA32MV876");
    }

    @GetMapping("/{confirmationNumber}")
    public List<CheckoutDetails> getCheckout() {
        return Arrays.asList(new CheckoutDetails("1234567" , "Ravi Kumar" , "#1243 , 6th main , denver" , "234-(567)-1234" , CheckoutDetails.CarGroup.valueOf("A") , "34.50" , "122456"));
    }
}
