package com.FlexCodes.RoomBook2.Student;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "student")
@Table(name = "student"

)

public class student {



    @SequenceGenerator(
            name="student-sequence",
            sequenceName = "student-sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator ="student-sequence"

    )
    @Id
    @Column(name="Id",
            updatable = false,
            nullable = false

    )

    private long id;
    @Column(name = "RegNo",
            updatable = false,
            nullable = false



    )
    private String RegNo;


    @Column(
            name = "FirstName",

            nullable = false,
            unique = true

    )
    private String Firstname;
    @Column(
            name = "LastName",

            nullable = false,
            columnDefinition="TEXT"
    )

    private String LastName;
    @Column(
            name = "Email",
            nullable = true

    )


    private String Email;
    @Column(
            name = "PhoneNo",
            unique = true,

            nullable = false

    )
    private String PhoneNo;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        RegNo = regNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public student(long id, String regNo, String firstname, String lastName, String email, String phoneNo) {
        this.id = id;
        RegNo = regNo;
        Firstname = firstname;
        LastName = lastName;
        Email = email;
        PhoneNo = phoneNo;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", RegNo='" + RegNo + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                '}';
    }



}
