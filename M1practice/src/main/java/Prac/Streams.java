package Prac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
//		List<Integer> nums=Arrays.asList(2,1,3,5,4,6,7);
////		nums.stream().
////		filter(n->n%2==0).map(n->n*2).forEach(System.out::println);
//////		
////		List<Integer> res=nums.stream().
////				filter(n->n%2==0).
////				map(n->n*2).
////				collect(Collectors.toList());
////		System.out.println(res);
////		long l=nums.stream().filter(n->n%2==0).count();
////		System.out.println(l);
////		nums.stream().sorted((a,b)->b-a).forEach(System.out::println);
//		int sum=nums.stream()
//				.reduce(0,(a,b)->a+b);
//		System.out.println(sum);
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee("101","Khasim",98000));
		emp.add(new Employee("102","Chotu",43000));
		emp.add(new Employee("103","Swarna",56000));
		emp.add(new Employee("104","Apple",10000));
		
		List<Employee> res=
		emp.stream().
		filter(e->e.getSalary()>50000)
		.collect(Collectors.toList());
		System.out.println(res);
	}
}
