package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @Override
    public List<PatientEntity> findByLastName(String lastName) {
        TypedQuery<PatientEntity> query = entityManager.createQuery(
                "SELECT p FROM PatientEntity p WHERE p.lastName = :lastName", PatientEntity.class);
        query.setParameter("lastName", lastName);
        return query.getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsWithMoreThanXVisits(int visitCount) {
        TypedQuery<PatientEntity> query = entityManager.createQuery(
                "SELECT p FROM PatientEntity p WHERE SIZE(p.visits) > :visitCount", PatientEntity.class);
        query.setParameter("visitCount", visitCount);
        return query.getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsBornBeforeYear(int year) {
        TypedQuery<PatientEntity> query = entityManager.createQuery(
                "SELECT p FROM PatientEntity p WHERE YEAR(p.dateOfBirth) < :year", PatientEntity.class);
        query.setParameter("year", year);
        return query.getResultList();
    }
}