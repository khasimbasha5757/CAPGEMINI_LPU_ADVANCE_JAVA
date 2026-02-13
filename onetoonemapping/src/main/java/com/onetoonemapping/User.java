package com.onetoonemapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class User {
	public static void main(String[] args) {
//		insertCarAndEngine();
//		findEngineById();
		DeleteEngineByID();
	}
	public static void DeleteEngineByID() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Query updateQuery=em.createNativeQuery("Update Car set engine_id=null where engine_id=?1");
		updateQuery.setParameter(1,2);
		Query deleteQuery=em.createNativeQuery("Delete from engine where id=?1");
		deleteQuery.setParameter(1,2);
		
		et.begin();
		updateQuery.executeUpdate();
		deleteQuery.executeUpdate();
		et.commit();
	}
	
	
	public static void findEngineById() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Engine e=em.find(Engine.class,2);
		System.out.println(e);
	}
	public static void findByCarId() {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			Car c=em.find(Car.class, 2);
			System.out.println(c);
	}
	public static void insertCarAndEngine() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Engine e=new Engine();
		e.setId(2);
		e.setType("V8");
		e.setFuelType("Petrol");
		e.setMileage("12");
		e.setCc("3000");
		Car c=new Car();
		c.setId(2);;
		c.setBrand("Volkswagen");
		c.setModel("Polo GT10");
		c.setModelYear("2019");
		c.setPrice(400000);
		c.setEngine(e);
		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();
	}

}