package com.javatpoint;

import java.sql.*;

public class DBConnection {
	
	 public Connection getConnection() throws SQLException {
		   try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   String url = "jdbc:mysql://localhost:3306/test";
		   String name = "root";
		   String password = "Baghel@1234";

		   Connection con = DriverManager.getConnection(url, name, password);
		   return con;
		 }
	
	
//	public static void main(String args[]){  
//		try{  
//		Class.forName("com.mysql.jdbc.Driver");  
//		System.out.println("inside class");
//		Connection con=DriverManager.getConnection(  
//		"","root","Baghel@1234");  
//		//here sonoo is database name, root is username and password  
//		System.out.println("connected");
//		Statement stmt=con.createStatement();  
//		ResultSet rs=stmt.executeQuery("select * from emp1");  
//		while(rs.next())  
//		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//		con.close();  
//		}catch(Exception e){ System.out.println(e);}  
//		} 

}
