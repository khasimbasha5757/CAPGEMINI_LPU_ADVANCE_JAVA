package Practiceon12feb;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		if(s1.marks<s2.marks)
			return 1;
		return -1;
	}
}
