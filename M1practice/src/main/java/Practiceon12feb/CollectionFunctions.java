package Practiceon12feb;
import java.util.*;
public class CollectionFunctions {
	public static void main(String[] args) {
			List<Student> l=new LinkedList<>();
			Student s1=new Student(101,"Khasim",98);
			Student s2=new Student(101,"Aravind",35);
			Student s3=new Student(103,"Swarna",88);
			Student s4=new Student(103,"Apple",79);
			Student s5=new Student(104,"Chotu",42);
			l.add(s1);
			l.add(s2);
			l.add(s3);
			l.add(s4);
			l.add(s5);
			Collections.sort(l,new StudentComparator());
			
						for(Student a:l) {
			System.out.println(a);
	}
}
}