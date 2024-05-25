package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PatientTO implements Serializable {
    private Long id;

    private String firstName;

    private String lastName;

    private String patientNumber;

    private LocalDate dateOfBirth;

    private String email;

    private String telephoneNumber;

    private List<VisitTO> visit;

    public PatientTO(Long id, String firstName, String lastName, String patientNumber, LocalDate dateOfBirth, String email, String telephoneNumber, List<VisitTO> visit) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientNumber = patientNumber;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.visit = visit;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public List<VisitTO> getVisit() {
        return visit;
    }
}
