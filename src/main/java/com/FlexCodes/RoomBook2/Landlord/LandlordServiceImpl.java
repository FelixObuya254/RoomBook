package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LandlordServiceImpl implements LandlordService {
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
    public boolean deleteById(Long Id) {
        try {
            landlordRepo.deleteById(Id);
            return true;

        } catch (Exception e) {
            return false;
        }

    }
    @Override
    public Optional<Landlord> findById(Long Id) {
        return Optional.ofNullable(landlordRepo.findById(Id).orElse(null));
    }

    @Override
    public boolean UpdateLandlord(Long Id, Landlord Updated) {
        Optional<Landlord>LandlordOptional=landlordRepo.findById(Id);
        if(LandlordOptional.isPresent()){
            Landlord landlord=LandlordOptional.get();
            landlord.setFirstName(Updated.getFirstName());
            landlord.setLastName(Updated.getLastName());
            landlord.setEmail(Updated.getEmail());
            landlord.setIdNo(Updated.getIdNo());
            landlord.setPhoneNo(Updated.getPhoneNo());
            landlord.setPhotoUrl(Updated.getPhotoUrl());
            landlordRepo.save(landlord);

        }
        return false;
    }

    @Override
    public List <Landlord> findBy(String FirstName) {
        return LandlordRepo.findBy(FirstName);
    }


}





