package OneToOneBidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity	
public class Passport {
	@Id
private int id;
private String name;
private String DateOfBirth;
private String citizen;
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
@OneToOne(mappedBy="passport")
private Person person;
public String getCitizen() {
	return citizen;
}
public void setCitizen(String citizen) {
	this.citizen = citizen;
}
//@OneToOne
//private Person person;
//public Person getPerson() {
//	return person;
//}
//public void setPerson(Person person) {
//	this.person = person;
//}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Passport [id=" + id + ", name=" + name + ", DateOfBirth=" + DateOfBirth + ", citizen=" + citizen
			+ ", person=" +person + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
}
