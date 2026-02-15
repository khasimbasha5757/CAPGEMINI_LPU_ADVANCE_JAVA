package com.assignment5.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.assignment5.Appointment;
import com.assignment5.Doctor;
import com.assignment5.HospitalService;
import com.assignment5.JPAUtil;
import com.assignment5.MedicalRecord;
import com.assignment5.Patient;

import jakarta.persistence.EntityManager;

public class HospitalTest {

    HospitalService service = new HospitalService();

    @Test
    void oneToOnePersistTest() {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Patient p = new Patient();
        p.setName("Ravi");
        p.setAge(30);
        p.setContact("99999");

        MedicalRecord m = new MedicalRecord();
        m.setBloodGroup("O+");
        m.setAllergies("None");

        service.registerPatient(em, p, m);
        em.getTransaction().commit();
    }

    @Test
    void oneToManyPersistTest() {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Doctor d = new Doctor();
        d.setName("Dr Kumar");
        d.setSpecialization("Cardio");

        Appointment a1 = new Appointment();
        a1.setVisitDate(LocalDate.now());
        a1.setFee(500);

        Appointment a2 = new Appointment();
        a2.setVisitDate(LocalDate.now());
        a2.setFee(700);

        service.addAppointmentsToDoctor(em, d, List.of(a1, a2));
        em.getTransaction().commit();
    }

    @Test
    void manyToOnePersistTest() {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Patient p = new Patient();
        p.setName("Test Patient");
        p.setAge(30);
        p.setContact("99999");
        em.persist(p);

        Appointment a = new Appointment();
        a.setVisitDate(LocalDate.now());
        a.setFee(400);
        a.setPatient(p);
        em.persist(a);

        em.getTransaction().commit();
    }


    @Test
    void daoUpdateTest() {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Appointment a = new Appointment();
        a.setVisitDate(LocalDate.now());
        a.setFee(300);
        em.persist(a);
        em.flush();   
        service.updateAppointmentFee(em, a.getId(), 1000);

        em.getTransaction().commit();
    }
    
    @Test
    void daoDeleteTest() {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Patient p = new Patient();
        p.setName("Temp");
        p.setAge(25);
        p.setContact("123");

        em.persist(p);
        em.flush();

        em.remove(p);

        em.getTransaction().commit();
    }
    @Test
    void serviceWorkflowTest() {
    	
    }
}