package OneToOneBidirectional;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
//	List<Person> per=new ArrayList<>();
//	List<Passport> pass=new ArrayList<>();
//	Person p1=new Person();
	Passport p=new Passport();
	p.setId(102);
	p.setName("Miller");
	p.setCitizen("Indian");
	p.setDateOfBirth("23/09/1995");
	
	Person person=new Person();
	person.setId(2);
	person.setName("Allen");
	person.setPassport(p);
	person.setEmail("khasimbasha5757@gmail.com");
	person.setPhone(8687710292L);
	p.setPerson(person);
	person.setPassport(p);
	et.begin();
	em.persist(person);
	et.commit();
}
}
