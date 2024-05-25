package com.capgemini.wsb.patient.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testShouldFindPatientsByLastName() {
        // given
        String lastName = "last2";

        // when
        List<PatientEntity> foundPatients = patientDao.findByLastName(lastName);

        // then
        assertThat(foundPatients).isNotNull();
        assertThat(foundPatients).isNotEmpty();
        assertThat(foundPatients.get(0).getLastName()).isEqualTo(lastName);
    }

    @Transactional
    @Test
    public void testShouldFindPatientsWithMoreThanXVisits() {
        // given
        int visitCount = 1;

        // when
        List<PatientEntity> foundPatients = patientDao.findPatientsWithMoreThanXVisits(visitCount);

        // then
        assertThat(foundPatients).isNotNull();
        assertThat(foundPatients).isNotEmpty();
        for (PatientEntity patient : foundPatients) {
            assertThat(patient.getVisits().size()).isGreaterThan(visitCount);
        }
    }

    @Transactional
    @Test
    public void testShouldFindPatientsBornBeforeYear() {
        // given
        int year = 2000;

        // when
        List<PatientEntity> foundPatients = patientDao.findPatientsBornBeforeYear(year);

        // then
        assertThat(foundPatients).isNotNull();
        assertThat(foundPatients).isNotEmpty();
        for (PatientEntity patient : foundPatients) {
            assertThat(patient.getDateOfBirth().getYear()).isLessThan(year);
        }
    }
}