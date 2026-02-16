package Practiceon12feb;
import java.util.*;
public class Main {
	private List<School> s=new ArrayList<>();
	public void addSchool(int sid,String sname,int marks) {
		s.add(new School(sid,sname,marks));
	}
	public boolean deleteElement(int sid) {
		
		Iterator<School> a=s.iterator();
		while(a.hasNext()) {
			if(a.next().getId()==sid) {
				a.remove();
				return true;
			}
		}
		
		return false;
	}
	public void display() {
		for(School a:s) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Main m=new Main();
		Scanner s=new Scanner(System.in);
		System.out.println("Tell me how many members do u want to enter: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Give me the detailes for Student "+i+" : ");
			int sid=s.nextInt();
			String sname=s.next();
			int marks=s.nextInt();
			
			m.addSchool(sid,sname,marks);
		}
//		m.addSchool(1, "KHAsim", 90);
//		m.addSchool(2, "chotu", 98);
//		m.display();
//		m.deleteElement(1);
		m.display();
	}
}