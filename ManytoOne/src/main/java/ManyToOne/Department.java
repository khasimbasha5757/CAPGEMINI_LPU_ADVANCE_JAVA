package ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Department {
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="number_sequence")
		@SequenceGenerator(name = "number",sequenceName="number_sequence", initialValue=100,allocationSize = 1)
		private int id;
		@Override
		public String toString() {
			return "Department [id=" + id + ", name=" + name + ", ManagerName=" + ManagerName + ", NoOfEmployees="
					+ NoOfEmployees + "]";
		}
		private String name;
		private String ManagerName;
		private int NoOfEmployees;
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
		public String getManagerName() {
			return ManagerName;
		}
		public void setManagerName(String managerName) {
			ManagerName = managerName;
		}
		public int getNoOfEmployees() {
			return NoOfEmployees;
		}
		public void setNoOfEmployees(int noOfEmployees) {
			NoOfEmployees = noOfEmployees;
		}
		
}
