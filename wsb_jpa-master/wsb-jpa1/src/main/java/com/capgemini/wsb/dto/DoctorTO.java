package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.enums.Specialization;

import java.io.Serializable;

public class DoctorTO implements Serializable {
    private Long id;

    private String firstName;

    private String lastName;

    private String doctorNumber;

    private String email;

    private Specialization specialization;

    private String telephoneNumber;

    public DoctorTO(Long id, String firstName, String lastName, String doctorNumber, String email, Specialization specialization, String telephoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.doctorNumber = doctorNumber;
        this.email = email;
        this.specialization = specialization;
        this.telephoneNumber = telephoneNumber;
    }
}
