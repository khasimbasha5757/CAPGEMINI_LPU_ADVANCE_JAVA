package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDoperations {
//private static final String I = null;
	

public static void addEmployee() {
	String url="jdbc:postgresql://localhost:5432/school";
	String un="postgres";
	String pwd="root";
	Scanner scan=new Scanner(System.in);
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Class loaded");
		//to establish connection.......
		Connection connect =DriverManager.getConnection(url,un,pwd);
		String sql="insert into student values(?,?,?,?)";
		PreparedStatement pstm=connect.prepareStatement(sql);
		System.out.println("Enter Id: ");
		int id=scan.nextInt();
		pstm.setInt(1, id);
		System.out.println("Enter Name : ");
		String name=scan.next();
		pstm.setString(2,name);
		
		System.out.println("Enter Branch : ");
		String branch=scan.next();
		pstm.setString(3,branch);
		System.out.println("Enter gender: ");
		String gender=scan.next();
		pstm.setString(4, gender);
		pstm.execute();
		connect.close();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void DeleteEmployeeById() {
	String url="jdbc:postgresql://localhost:5432/school";
	String un="postgres";
	String pwd="root";
	Scanner scan=new Scanner(System.in);
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Class loaded");
		//to establish connection.......
		Connection connect =DriverManager.getConnection(url,un,pwd);
		String sql="delete from student where id= ?";
		PreparedStatement pstm=connect.prepareStatement(sql);
		System.out.println("Enter Id: ");
		int id=scan.nextInt();
		pstm.setInt(1, id);
		int rows=pstm.executeUpdate();
		if (rows > 0) {
		    System.out.println("Employee deleted successfully ✅");
		} else {
		    System.out.println("No employee found with this ID ❌");
		}
		pstm.execute();
		connect.close();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void UpdateEmpSalByid() {
	String url="jdbc:postgresql://localhost:5432/school";
	String un="postgres";
	String pwd="root";
	Scanner scan=new Scanner(System.in);
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Class loaded");
		//to establish connection.......
		Connection connect =DriverManager.getConnection(url,un,pwd);
		String sql="update employee set salary=100000 where id= ?";
		PreparedStatement pstm=connect.prepareStatement(sql);
		System.out.println("Enter Employee id: ");
		int id=scan.nextInt();
		pstm.setInt(1, id);
}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args) {
CRUDoperations c=new CRUDoperations();
//c.addEmployee();
//c.DeleteEmployeeById();
c.UpdateEmpSalByid();
}
}
