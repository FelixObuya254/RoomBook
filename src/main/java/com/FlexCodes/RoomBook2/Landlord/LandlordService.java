package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface LandlordService {
    List<Landlord>findAll();
    void save(Landlord landlord);
    void deleteById(Long Id);
    Optional<Landlord> findById(Long Id);
}

