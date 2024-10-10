package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Landlord>> Landlords(@PathVariable Landlord landlord) {
        return new ResponseEntity<>(landlordService.findAll(), HttpStatus.FOUND);
    }

    @PostMapping("/post")
    public ResponseEntity<String> createLandlord(@RequestBody Landlord landlord) {
        landlordService.save(landlord);
        return new ResponseEntity<>("Landlord successfully added", HttpStatus.OK);

    }

    @GetMapping("/Landlord/{FirstName}")
    public ResponseEntity<Landlord> getLandlord(@PathVariable String FirstName) {
        List<Landlord> landlord = landlordService.findBy(FirstName);
        ResponseEntity<Landlord> landlord1 = (ResponseEntity<Landlord>) List.of(landlord);
        return landlord1;


    }
    @PutMapping("/{Id}")
    public ResponseEntity<String>UpdateHostel(@PathVariable Long Id, @RequestBody Landlord Updated){
        boolean updated=landlordService.UpdateLandlord(Id,Updated);
        if(updated)
            return new ResponseEntity<>("Landlord updated successfully",HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
