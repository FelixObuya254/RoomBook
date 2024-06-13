package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class LandlordController {
    private final LandlordService landlordService;

    @Autowired

    public LandlordController(LandlordService landlordService) {
        this.landlordService = landlordService;
    }
    @GetMapping("/Landlord")
    List<Landlord>getAllLandlords(){
        return landlordService.findAll();
    }
    @PostMapping("/post")
    public String createLandlord(@RequestBody Landlord landlord){
        landlordService.save(landlord);
        return "Successfull";

    }

}
