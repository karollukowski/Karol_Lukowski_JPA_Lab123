package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.service.PatientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceImplTest {

    @Autowired
    private PatientService patientService;

    @Test
    @Transactional
    public void testDeletePatientById() {
        //given
        long id = 2;

        //when
        assertThat(patientService.findById(id)).isNotNull();
        patientService.deleteById(id);

        //then
        assertThat(patientService.findById(id)).isNull();
    }

    @Test
    @Transactional
    public void testGetPatientById() {
        //given
        long id = 1;

        //when
        PatientTO result = patientService.findById(id);

        //then
        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(id);
        assertThat(result.getFirstName()).isEqualTo("name");
        assertThat(result.getLastName()).isEqualTo("last");
        assertThat(result.getPatientNumber()).isEqualTo("1");
        assertThat(result.getVisit()).isNotNull();
        assertThat(result.getVisit()).isNotEmpty();
        assertThat(result.getVisit()).hasSize(2);
        assertThat(result).isEqualToComparingOnlyGivenFields(result.getVisit().get(0).getPatientData(), "firstName", "lastName", "patientNumber");
        assertThat(result).isEqualToComparingOnlyGivenFields(result.getVisit().get(1).getPatientData(), "firstName", "lastName", "patientNumber");
        assertThat(result.getVisit().get(0).getDoctor()).isNotNull();
        assertThat(result.getVisit().get(1).getDoctor()).isNotNull();
    }
}