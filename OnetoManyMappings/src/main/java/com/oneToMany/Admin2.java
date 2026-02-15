package com.oneToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Admin2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		String sqldeletecs = "delete from college_Student_onetomany where  st_s_id = ?1";
		String sqldeletes = "delete from student_onetomany where s_id = ?1";
		
		Query delete_college_student = em.createNativeQuery(sqldeletecs);
		
		Query delete_student = em.createNativeQuery(sqldeletes);
		
		
		delete_college_student.setParameter(1, 101);
		
		delete_student.setParameter(1, 101);
		
		et.begin();
		delete_college_student.executeUpdate();
		delete_student.executeUpdate();
		et.commit();

	}

}
