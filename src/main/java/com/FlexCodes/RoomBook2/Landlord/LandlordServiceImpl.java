package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LandlordServiceImpl implements LandlordService{
    private List<Landlord>Landlords=new ArrayList<>();
    private LandlordRepo landlordRepo;
    @Autowired

    public LandlordServiceImpl(LandlordRepo landlordRepo) {
        this.landlordRepo = landlordRepo;
    }

    @Override
    public List<Landlord> findAll() {
        return Landlords;
    }

    @Override
    public void save(Landlord landlord) {
        Landlords.add(landlord);

    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public Landlord findById(Long Id) {
        return null;
    }

    public LandlordRepo getLandlordRepo() {
        return landlordRepo;
    }

    public void setLandlordRepo(LandlordRepo landlordRepo) {
        this.landlordRepo = landlordRepo;
    }
}
