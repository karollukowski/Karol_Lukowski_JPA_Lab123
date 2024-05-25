package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

public final class VisitMapper {

    public static VisitTO mapToTO(final VisitEntity visit) {
        if (visit == null) {
            return null;
        }
        return new VisitTO(
                visit.getId(),
                visit.getDescription(),
                visit.getTime(),
                DoctorMapper.mapToTO(visit.getDoctor()),
                PatientMapper.mapToPatientPartialTO(visit.getPatient())
        );
    }
}
