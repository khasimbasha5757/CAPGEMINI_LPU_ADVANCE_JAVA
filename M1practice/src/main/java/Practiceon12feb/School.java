package Practiceon12feb;

public class School {
	private int sid;
	private String sname;
	private int marks;
	School(int sid,String sname,int marks){
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	public int getId() {
		return sid;
	}
	public String getName() {
		return sname;
	}
	public int getMarks() {
		return marks;
	}
	public String toString() {
		return sid+" "+sname+" "+marks;
	}
}
