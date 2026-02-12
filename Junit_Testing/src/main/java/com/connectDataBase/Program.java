package com.connectDataBase;

public class Program {
		public static boolean isPalindrome(String str) {
			StringBuilder s=new StringBuilder(str);
			return s.reverse().toString().equals(str)?true:false;
		}
		public static void main(String[] args) {
			System.out.println(isPalindrome("MADAM"));
		}
		public static boolean PositiveOrNot(int num) {
			num=10;
			return (num>0?true:false);
		}
		public static int add(int a,int b) {
			return a+b;
		}
}
