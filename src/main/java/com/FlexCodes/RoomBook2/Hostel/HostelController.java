package com.FlexCodes.RoomBook2.Hostel;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class HostelController {
    private final HostelService hostelService;

    public HostelController(HostelService hostelService) {
        this.hostelService = hostelService;
    }
    @PostMapping("/Post")
    public String CreateHostel(@RequestBody Hostel hostel){
        hostelService.save(hostel);
        return "Added successfully";
    }
    @GetMapping("/Hostel")
    List<Hostel>ListOfHostel(){
        return hostelService.finaAll();
    }

}
