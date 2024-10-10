package com.FlexCodes.RoomBook2.Landlord;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LandlordRepo extends JpaRepository<Landlord, Long> {

    static List<Landlord> findBy(String firstName) {
        return List<Landlord>;
    }


}
