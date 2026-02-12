package com.practice;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int Eid;
		private String Ename;
		public int getEid() {
			return Eid;
		}
		public void setEid(int eid) {
			Eid = eid;
		}
		public String getEname() {
			return Ename;
		}
		public void setEname(String ename) {
			Ename = ename;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		private int salary;
	
	
}
