package com.abg.ibc.garage.TeamsNotifier.controller;


import com.abg.ibc.garage.TeamsNotifier.model.CheckoutDetails;
import com.abg.ibc.garage.TeamsNotifier.model.VehicleAddConfirmation;
import com.abg.ibc.garage.TeamsNotifier.model.VehicleInfo;
import com.azure.core.annotation.Get;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/readyLine")
public class ReadyLineController {

    @GetMapping
    public List<VehicleInfo> getListOfVehiclesInReadyLine(@RequestParam String location) {
        return Arrays.asList(new VehicleInfo("KA09MV1234" , "1234"  , CheckoutDetails.CarGroup.C , "DEN"),new VehicleInfo("KA09MV5678" , "5678"  , CheckoutDetails.CarGroup.D , "DEN"));
    }

    @PostMapping("/addVehicle")
    public VehicleAddConfirmation addVehicleToFleet(@RequestParam String location,
                                                    @RequestBody VehicleInfo vehicleInfo) {
        return new VehicleAddConfirmation("1234abcd67" , "5678" , "ABCxty");
    }

    @DeleteMapping("/delete")
    public String removeVehicleFromReadyLine(@RequestParam String mva) {
        return "vehicle deleted successfully";
    }

    @PutMapping("/update/{mva}")
    public String vehicleInfoUpdate (@PathVariable String mva, @RequestBody VehicleInfo vehicleInfo){
        return "vehicle updated successfully";
    }
}
