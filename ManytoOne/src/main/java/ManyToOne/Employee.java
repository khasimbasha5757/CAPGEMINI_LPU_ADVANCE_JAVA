package ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id	
	private int id;
		private String name;
		public Department getD() {
			return d;
		}
		public void setD(Department d) {
			this.d = d;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Designation=" + Designation
					+ ", d=" + d + "]";
		}
		private double salary;
		private String Designation;
		
		@ManyToOne
		Department d;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDesignation() {
			return Designation;
		}
		public void setDesignation(String designation) {
			Designation = designation;
		}
		
}
