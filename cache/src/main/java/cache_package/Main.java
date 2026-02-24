package cache_package;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
		public static void main(String[] args) {
//			insert();
			read();
			
		}
		public static void read() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		    EntityManager em = emf.createEntityManager();
		    EntityTransaction et = em.getTransaction();

		    et.begin();
		    Product p = em.find(Product.class, 2);
		    if (p != null) {
		        em.remove(p);
		    }
		    et.commit();

		    em.close();
		    emf.close();
		}
//		public static void read() {
//			EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
//			EntityManager em1=emf.createEntityManager();
//			EntityTransaction et=em1.getTransaction();
//			
////			Product p=em1.find(Product.class, 1);
////			System.out.println(p.getName());
////			em1.close();
//			et.begin();
//			EntityManager em2=emf.createEntityManager();
//			Product p1=em2.find(Product.class, 2);
////			System.out.println(p1.getName());
//		
//			em2.remove(p1);
////			em2.close();
//			et.commit();
//			em2.close();
//			emf.close();
//		}
		
	public static void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Product p=new Product();
		p.setId(101);
		p.setName("Khasim");
		Product p1=new Product();
		p1.setId(102);
		p1.setName("Basha");
		
		et.begin();
		em.persist(p1);
		et.commit();
	}
}
