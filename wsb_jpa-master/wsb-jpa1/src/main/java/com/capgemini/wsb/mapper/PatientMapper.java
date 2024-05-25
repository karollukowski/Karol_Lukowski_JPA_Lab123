package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientPartialTO;
import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.stream.Collectors;

public final class PatientMapper {

    public static PatientTO mapToTO(final PatientEntity patient) {
        if (patient == null) {
            return null;
        }

        return new PatientTO(
                patient.getId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getPatientNumber(),
                patient.getDateOfBirth(),
                patient.getEmail(),
                patient.getTelephoneNumber(),
                patient.getVisits().stream()
                        .map(VisitMapper::mapToTO)
                        .collect(Collectors.toList())
        );
    }

    public static PatientPartialTO mapToPatientPartialTO(PatientEntity patient) {
        if (patient == null) {
            return null;
        }
        return new PatientPartialTO(
                patient.getId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getPatientNumber()
        );
    }
}
