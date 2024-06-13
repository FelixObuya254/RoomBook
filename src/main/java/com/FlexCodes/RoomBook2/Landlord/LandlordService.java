package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface LandlordService {
    List<Landlord>findAll();
    void save(Landlord landlord);
    void deleteById(Long Id);
    Landlord findById(Long Id);
}

