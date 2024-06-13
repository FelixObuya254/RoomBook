package com.FlexCodes.RoomBook2.Area;

import org.springframework.stereotype.Service;


import java.util.List;
@Service

public class AreaService {
public static List<Area>getArea(){
    return List.of(
            new Area("Kitere",
                    "Chief center",
                    "Other")
    );
}
}
