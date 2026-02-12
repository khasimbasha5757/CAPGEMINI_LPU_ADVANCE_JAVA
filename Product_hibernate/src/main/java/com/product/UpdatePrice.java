package com.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdatePrice {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
	et.begin();
	String jpql="Update Product p set p.price=?1 where p.price?2";
	Query query=em.createQuery(jpql);
	query.setParameter(1,80.0);
	query.setParameter(2,100.0);
	query.executeUpdate();
	et.commit();
	em.close();
	emf.close();	

}
}