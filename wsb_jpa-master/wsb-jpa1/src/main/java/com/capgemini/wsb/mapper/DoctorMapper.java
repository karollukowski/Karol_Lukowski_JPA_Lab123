package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public final class DoctorMapper {

    public static DoctorTO mapToTO(final DoctorEntity doctor) {
        if (doctor == null) {
            return null;
        }
        return new DoctorTO(
                doctor.getId(),
                doctor.getFirstName(),
                doctor.getLastName(),
                doctor.getDoctorNumber(),
                doctor.getEmail(),
                doctor.getSpecialization(),
                doctor.getTelephoneNumber()
        );
    }
}
