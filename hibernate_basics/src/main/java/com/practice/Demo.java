package com.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
public static void main(String[] args){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s= new Student();
		s.setId(1);;
		s.setName("Virat");
		s.setPercentage(99);
		s.setDob("06-11-1991");
		et.begin();
		em.persist(s);
		et.commit();
		emf.close();
		
}
}