package com.capgemini.wsb.dto;

import java.io.Serializable;

public class PatientPartialTO implements Serializable {
    private Long id;

    private String firstName;

    private String lastName;

    private String patientNumber;

    public PatientPartialTO(Long id, String firstName, String lastName, String patientNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientNumber = patientNumber;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatientNumber() {
        return patientNumber;
    }
}
