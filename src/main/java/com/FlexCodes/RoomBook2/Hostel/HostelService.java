package com.FlexCodes.RoomBook2.Hostel;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface HostelService {
    void save(Hostel hostel);
   Optional<Hostel> findById(Long Id);
    String findByName();
    List<Hostel>finaAll();
}
