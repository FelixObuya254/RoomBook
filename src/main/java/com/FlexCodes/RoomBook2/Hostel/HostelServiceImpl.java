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
    public Optional<Hostel> findById(Long Id)  {
        return Optional.ofNullable(hostelRepo.findById(Id).orElse(null));
    }


    @Override
    public String findByName() {
        return "";
    }


    @Override
    public List<Hostel> finaAll() {
       return hostelRepo.findAll();
    }

    @Override
    public boolean deleteById(Long Id) {
        try {

            hostelRepo.deleteById(Id);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    @Override
    public boolean UpdateHostel(Long Id, Hostel Updated) {
        Optional<Hostel>HostelOptional=hostelRepo.findById(Id);
        if(HostelOptional.isPresent()){
            Hostel hostel=HostelOptional.get();
            hostel.setHostelName(Updated.getHostelName());
            hostel.setHostelType(Updated.getHostelType());
            hostel.setNumOfFloors(Updated.getNumOfFloors());
            hostel.setNumOfRooms(Updated.getNumOfRooms());
            hostel.setDescription(Updated.getDescription());
            hostelRepo.save(hostel);
            return true;
        }
        return false;
    }
}
