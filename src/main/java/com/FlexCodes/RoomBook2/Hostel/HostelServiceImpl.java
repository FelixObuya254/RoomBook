package com.FlexCodes.RoomBook2.Hostel;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class HostelServiceImpl implements HostelService {
   private HostelRepo hostelRepo;
    private Hostel hostel;

    public HostelServiceImpl(HostelRepo hostelRepo) {
        this.hostelRepo = hostelRepo;
    }

    @Override
    public void save(Hostel hostel) {
        hostelRepo.save(hostel);

    }

    @Override
    public Optional<Hostel> findById(Long Id) {
        return hostelRepo.findById(Id);
    }



    @Override
    public String findByName() {
        return "";
    }


    @Override
    public List<Hostel> finaAll() {
       return hostelRepo.findAll();
    }
}
