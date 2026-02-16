package ManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
	EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee e1=new Employee();
		e1.setName("Dingu");
		e1.setDesignation("Manager");
		e1.setSalary(30000);
		Employee e2=new Employee();
		e2.setName("Bingu");
		e2.setDesignation("IT EMp");
		e2.setSalary(80000);
		Department d1=new Department();
		d1.setName("DevOps");
		d1.setManagerName("ShannuBhai");
		d1.setNoOfEmployees(34);
		e1.setD(d1);
		e2.setD(d1);
		et.begin();
		em.persist(d1);
		em.persist(e1);
		em.persist(e2);
		et.commit();
}
}