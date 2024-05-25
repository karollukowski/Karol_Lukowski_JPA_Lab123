package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class VisitTO implements Serializable {
    private Long id;

    private String description;

    private LocalDateTime time;

    private DoctorTO doctor;

    private PatientPartialTO patientData;

    public VisitTO(Long id, String description, LocalDateTime time, DoctorTO doctor, PatientPartialTO patientData) {
        this.id = id;
        this.description = description;
        this.time = time;
        this.doctor = doctor;
        this.patientData = patientData;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public DoctorTO getDoctor() {
        return doctor;
    }

    public PatientPartialTO getPatientData() {
        return patientData;
    }
}
