package com.javatpoint;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Forget_servlet
 */
public class Forget_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forget_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname2=request.getParameter("uname3");
		//String oldpassword=request.getParameter("oldpass");
		String newpassword=request.getParameter("newpass");
		System.out.println("newpassword is ::"+newpassword);
		DBConnection db=new DBConnection();
		try {
			Connection con=db.getConnection();
	
			
			 System.out.println("Connected database successfully...");
		      
		   
		      System.out.println("Inserting records into the table...");
		     
		      PreparedStatement stmt=con.prepareStatement("update reg1 set pass=? where uname=?");  
	  
		      stmt.setString(1,newpassword); 
		      stmt.setString(2,uname2);
		        
		      int i=stmt.executeUpdate();  
		      System.out.println(i+" records updated and password reset successfully"); 
		      RequestDispatcher rd=request.getRequestDispatcher("/reset.jsp");  
		        rd.forward(request, response); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
