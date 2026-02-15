package Practiceon12feb;

public class Student{
	String name;
	int rollno;
	int marks;
	Student(int rollno,String name,int marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return rollno+" "+name+" "+marks;
	}
//	public boolean equals(Object o) {
//		if(this==o) return true;
//		Student student=(Student)o;
//		return this.rollno==student.rollno;
//	}                                         
//	public int compareTo(Student s) {	
//		return this.rollno-s.rollno;
//	}
	
}
