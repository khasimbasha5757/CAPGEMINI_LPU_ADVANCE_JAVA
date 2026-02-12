package com.prac;

public class Calculator {
		public static int add(int a,int b) {
			return a+b;
		}
		public static String reverseString(String data) {
			String rev="";
			for(int i=data.length()-1;i>=0;i--) {
				rev+=data.charAt(i);
			}
			return rev;
		}
		public static boolean palindrome(String original) {
			String a=original;
			String rev=reverseString(original);
			System.out.println(rev);
			boolean bool=false;
			if(rev.equals(a)) {
				bool=true;
			}
			else {
				bool=false;
			}
			return bool;
	}
	public static boolean validName(String name) {
	boolean bool=true;
	for(int i=0;i<name.length();i++) {
	if(!((name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z') ||(name.charAt(i)==' '))) {
	bool=false;
}
	}
	return bool;
}
}

