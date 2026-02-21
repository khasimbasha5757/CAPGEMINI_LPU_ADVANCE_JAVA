package combinedConcepts;
import java.util.*;


public class Main {
	private List<Student> student=new ArrayList<>();
	public void addStudent(int id,String name,int marks,String gender) {
		student.add(new Student(id,name,marks,gender));
	}
	public void display() {
	Iterator<Student> a=student.iterator();
		while(a.hasNext()) {
				System.out.println(a.next());
			}
		}
	public void displayById(int id) throws IdException{
	Iterator<Student> a=student.iterator();
	while(a.hasNext()){
	Student s=a.next();
	if(s.getId()==id){
	System.out.println(s);
	return;
		}
}throw new IdException("This id does not exist ");
}	
public static void main(String[] args) {
	Main m=new Main();
	Scanner s=new Scanner(System.in);
	m.addStudent(101,"Khasim", 90, "Male");
	m.addStudent(102,"Chotu", 98, "Male");
	m.addStudent(103,"Swarna", 34, "Female");
	m.addStudent(104, "Apple", 40, "Female");
	m.display();
//	int id=s.nextInt();
//	try {
//	m.displayById(id);
//	}
//	catch(IdException e) {
//		System.out.println(e.getMessage());
//		}
//	}
//	

}
}

