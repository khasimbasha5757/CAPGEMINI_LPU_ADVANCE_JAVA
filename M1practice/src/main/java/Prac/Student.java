package Prac;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	int id;
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	id=s.nextInt();
	
	try {
		checkId(id);
	}
	catch(IdException e) {
		System.out.println(e.getMessage());
		return;
	}
	name=s.next();
	try {
		checkName(name);
	}
	catch(NameException n) {
		System.out.println(n.getMessage());
		return;
	}
	age=s.nextInt();
	System.out.println("Student data closed and accepted");	
}
public static void checkId(int id) throws IdException{
	if(id>0 && id<100) {
		return;
	}
	else {
		throw new IdException("This is not a valid id");
	}
}
public static void checkName(String name) throws NameException{
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(!((c>='a'&& c<='z' )||(c>='A' && c<='Z'))) {
			throw new NameException("this is not a valid name");
		}
	}
}
}
