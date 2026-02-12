package exceptionHandling;
public class Age {
public static void main(String[] args) {
	int age=19;
	String name="Khasim*basha";
	try {
		checkAge(age);
	}
	catch(ValidAgeException e) {
		System.out.println(e.getMessage());
		return;
	}
	try {
		checkName(name);
	}
	catch(ValidNameException e) {
		System.out.println(e.getMessage());
	}
}
public static void checkAge(int age) throws ValidAgeException{
		if(age>=18) {
			System.out.println("This is the valid age");
		}
		else {
			throw new ValidAgeException("This is a not valid age");
		}
	}
public static void checkName(String name) throws ValidNameException{
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(!((c>='a' && c<='z') || (c>='A' && c<='Z') || (c==' '))) {
					throw new ValidNameException("This is invalid name");
			}
}

		System.out.println("This is valid name");
}
}