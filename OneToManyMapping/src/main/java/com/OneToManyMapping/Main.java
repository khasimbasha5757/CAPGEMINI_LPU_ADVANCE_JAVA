package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s1=new Student();
	s1.setStudent_id(101);
	s1.setName("Khasim");
	s1.setBranch("CSE");
	
	Student s2=new Student();
	s2.setStudent_id(102);
	s2.setName("Abhi");
	s2.setBranch("ECE");
	
	College c=new College();
	c.setCollege_id(1);
	c.setName("JNTU");
	c.setLocation("HYDERABAD");
	c.setPincode("500087");
			
	List<Student> list =new ArrayList<>();
	list.add(s1);
	list.add(s2);
	
	et.begin();
	em.persist(c);
	em.persist(s1);
	em.persist(s2);
	et.commit();

	}
}