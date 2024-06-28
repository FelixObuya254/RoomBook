package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LandlordServiceImpl implements LandlordService{
   // private List<Landlord>Landlords=new ArrayList<>();
    private LandlordRepo landlordRepo;
    @Autowired

    public LandlordServiceImpl(LandlordRepo landlordRepo) {
        this.landlordRepo = landlordRepo;
    }

    @Override
    public List<Landlord> findAll() {
       return landlordRepo.findAll();
    }

    @Override
    public void save(Landlord landlord) {
        landlordRepo.save(landlord);

    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public Optional<Landlord> findById(Long Id) {
       return landlordRepo.findById(Id);
    }

    public LandlordRepo getLandlordRepo() {
        return landlordRepo;
    }

    public void setLandlordRepo(LandlordRepo landlordRepo) {
        this.landlordRepo = landlordRepo;
    }
}
