package com.oneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@jakarta.persistence.Entity

public class Student_Onetomany {
	
	@jakarta.persistence.Id
	private  int s_id;
	private String name;
	private String branch;
	
	public int getId() {
		return s_id;
	}
	public void setId(int s_id) {
		this.s_id = s_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Student_Onetomany [s_id=" + s_id + ", name=" + name + ", branch=" + branch + "]";
	}
}