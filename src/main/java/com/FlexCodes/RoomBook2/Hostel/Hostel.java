package com.FlexCodes.RoomBook2.Hostel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hostel")
public class Hostel {
    @jakarta.persistence.Id
    @Column(updatable = false,
            unique = true
    )
    private Long Id;
    @Column(nullable = false)
    private String HostelName;
    @Column(nullable = false)
    private String HostelType;
    @Column(nullable = false)

    private int NumOfFloors;
    @Column(nullable = false)
    private int NumOfRooms;
    private String Description;

    public Hostel(String description, String hostelName, String hostelType, Long id, int numOfFloors, int numOfRooms) {
        Description = description;
        HostelName = hostelName;
        HostelType = hostelType;
        Id = id;
        NumOfFloors = numOfFloors;
        NumOfRooms = numOfRooms;
    }



    public String getHostelName() {
        return HostelName;
    }

    public void setHostelName(String hostelName) {
        HostelName = hostelName;
    }

    public String getHostelType() {
        return HostelType;
    }

    public void setHostelType(String hostelType) {
        HostelType = hostelType;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getNumOfFloors() {
        return NumOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        NumOfFloors = numOfFloors;
    }

    public int getNumOfRooms() {
        return NumOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        NumOfRooms = numOfRooms;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Hostel() {
    }
}
