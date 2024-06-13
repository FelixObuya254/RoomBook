package com.FlexCodes.RoomBook2.Area;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/Area")

public class AreaController{
    private final Area area;
    @Autowired

    public AreaController(Area area) {
        this.area = area;
    }
    @GetMapping
    public List<Area>getArea(){
        return AreaService.getArea();
    }

}
