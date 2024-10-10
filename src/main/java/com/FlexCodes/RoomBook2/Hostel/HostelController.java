package com.FlexCodes.RoomBook2.Hostel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hostel")

public class HostelController {
    private final HostelService hostelService;

    public HostelController(HostelService hostelService) {
        this.hostelService = hostelService;
    }

    @PostMapping
    public ResponseEntity<String> CreateHostel(@RequestBody Hostel hostel) {
        hostelService.save(hostel);
        return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hostel>> Hostels(@PathVariable Hostel hostel) {
        return new ResponseEntity<>(hostelService.finaAll(), HttpStatus.FOUND);
    }

    @DeleteMapping("/{HostelName}")
    public ResponseEntity<String> DeleteHostel(@PathVariable Hostel HostelName) {
        boolean Deleted = hostelService.deleteByName(HostelName);
        if (Deleted) 
            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @PutMapping("/{Id}")
    public ResponseEntity<String>UpdateHostel(@PathVariable Long Id, @RequestBody Hostel Updated){
        boolean updated=hostelService.UpdateHostel(Id,Updated);
        if(updated)
            return new ResponseEntity<>("Hostel updated successfully",HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/Hostel/{HostelName}")
    public ResponseEntity<Hostel>findByName(@PathVariable String HostelName){
        Hostel hostel=hostelService.findByName(HostelName);
        if(hostel!=null)
        return new ResponseEntity<>(hostel,HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }




}
