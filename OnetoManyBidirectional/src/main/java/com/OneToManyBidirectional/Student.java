package com.OneToManyBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Student{
	@Id
	private  int s_id;
	private String name;
	private String branch;
	
	@OneToMany
	@JoinColumn
	private College college;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
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