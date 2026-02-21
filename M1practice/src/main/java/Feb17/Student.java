//package Feb17;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class Student {
//	private int id;
//	private String name;
//	private int marks;
//	private String gender;
//	public Student(int id, String name, int marks, String gender) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.marks = marks;
//		this.gender = gender;
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", gender=" + gender + "]";
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMarks() {
//		return marks;
//	}
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	Student(){
//			
//		}
//	
//	private List<Student> student=new ArrayList<>(); 
//	
//	public void addStudent(int id, String name, int marks, String gender) {
//		student.add(new Student(id,name,marks,gender));
//	}
//	public void display() {
//		Iterator<Student> i=student.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//	}
//	public void displayById(int id) {
//		Iterator<Student> a =student.iterator();
//		boolean there=false;
//		while(a.hasNext()) {
//			Student stu=a.next();
//			if(stu.getId()==id) {
//				System.out.println(stu);
//				there=true;
//			}
//		}
//		if(!there) {
//			System.out.println("Not found");
//		}
//	}
//	public void updateById(int Oldid,int Newid) {
//		Iterator<Student> a=student.iterator();
//		while(a.hasNext()) {
//			Student st=a.next();
//			if(st.getId()==Oldid) {
//				st.setId(Newid);
//				break;
//			}
//	}
//}
//	public void deleteById(int id) {
//		Iterator<Student> a=student.iterator();
//		while(a.hasNext()) {
//			Student st=a.next();
//			if(st.getId()==id) {
//				a.remove();
//				break;
//		}
//		}
//	}
//	public static void main(String[] args) {
//		Student s=new Student();
//		s.addStudent(101, "Khasim",98, "Male");
//		s.addStudent(102, "Swarna",87, "female");
//		s.addStudent(103, "Chotu",76, "Male");
//		s.addStudent(104, "Apple",54, "feMale");
//		s.addStudent(105, "ball",45, "feMale");
//		
////		s.updateById(104,110);
//		s.displayById(101);
////		s.deleteById(101);
////		s.display();
//	}
//}
