package com.FlexCodes.RoomBook2.Landlord;

import jakarta.persistence.*;

@Entity(name = "Landlord")
@Table(name = "landlord")

public class Landlord {
    @SequenceGenerator(
            name = "Landlord",
            sequenceName = "landlord_sequence",
            allocationSize = 1
    )
    @Id
    @Column(
            name = "id",
            unique = true,
            nullable = false,
            updatable = false
    )

    private Long Id;
    @Column(

            nullable = false,
            columnDefinition = "TEXT"
    )
    private String FirstName;
    @Column(

            nullable = false,
            columnDefinition = "TEXT"
    )
    private String LastName;
    @Column(

            nullable = false,
            columnDefinition = "TEXT"
    )
    private String IdNo;
    @Column(

            nullable = false,
            columnDefinition = "TEXT"
    )
    private String PhoneNo;
    @Column(
            nullable = false

    )
    private String Email;

    private String photoUrl;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String idNo) {
        IdNo = idNo;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Landlord(long id, String firstName, String lastName, String idNo,
                    String phoneNo, String email, String photoUrl) {
        this.Id = id;
        FirstName = firstName;
        LastName = lastName;
        IdNo = idNo;
        PhoneNo = phoneNo;
        Email = email;
        this.photoUrl = photoUrl;
    }

    public Landlord() {
    }

    @Override
    public String toString() {
        return "Landlord{" +
                "id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", IdNo='" + IdNo + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", Email='" + Email + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}
