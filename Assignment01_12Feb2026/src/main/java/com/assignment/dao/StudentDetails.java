package com.assignment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.assignment.entity.Student;

public class StudentDetails {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

    // INSERT
    public void insertStudent(Student student) {
        et.begin();
        em.persist(student);
        et.commit();
        System.out.println("Student inserted");
    }

    // FIND
    public Student findStudent(int id) {
        Student student = em.find(Student.class, id);
        return student;
    }

    // UPDATE
    public void updateStudent(int id, int newMarks) {
        et.begin();
        Student student = em.find(Student.class, id);

        if (student != null) {
            student.setMarks(newMarks);
            System.out.println("Student updated");
        } else {
            System.out.println("Student not found");
        }
        et.commit();
    }

    // DELETE
    public void deleteStudent(int id) {
        et.begin();
        Student student = findStudent(id);

        if (student != null) {
            em.remove(student);
            System.out.println("Student deleted");
        } else {
            System.out.println("Student not found");
        }
        et.commit();
    }

    // FIND ALL
    public void findAllStudents() {
        String jpql = "Select s from Student s";
        Query query = em.createQuery(jpql);
        List<Student> list = query.getResultList();
        list.forEach(System.out::println);
    }

    // CLOSE
    public void close() {
        em.close();
        emf.close();
    }
}
