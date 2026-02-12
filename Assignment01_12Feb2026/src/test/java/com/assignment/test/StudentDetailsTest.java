package com.assignment.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.assignment.dao.StudentDetails;
import com.assignment.entity.Student;

public class StudentDetailsTest {

    static EntityManagerFactory emf;
    EntityManager em;

    @BeforeAll
    public static void initEmf() {
        emf = Persistence.createEntityManagerFactory("postgres");
    }

    @BeforeEach
    public void initEm() {
        em = emf.createEntityManager();
    }

    @Test
    public void insertStudentTest() {
        StudentDetails details = new StudentDetails();
        Student student = new Student();
        student.setId(1);
        student.setName("Ravi");
        student.setEmail("ravi@gmail.com");
        student.setMarks(85);

        details.insertStudent(student);
    }

    @Test
    public void findStudentTest() {
        StudentDetails details = new StudentDetails();

        Student student = new Student();
        student.setId(2);
        student.setName("Kiran");
        student.setEmail("kiran@gmail.com");
        student.setMarks(90);

        details.insertStudent(student);

        Student foundStudent = details.findStudent(2);
        assertNotNull(foundStudent);
    }


    @AfterEach
    public void destroyEm() {
        em.close();
    }

    @AfterAll
    public static void destroyEmf() {
        emf.close();
    }
}
