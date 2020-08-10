package com.javatpoint;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login_servlet
 */
public class Login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname1=request.getParameter("uname");
		String upass1=request.getParameter("upass");
		System.out.println("uname is ::"+uname1);
		System.out.println("pasword is ::"+upass1);
		System.out.println("result::"+uname1.equalsIgnoreCase(uname1));
		if(uname1.equalsIgnoreCase(uname1) && upass1.equalsIgnoreCase(upass1))
			
		{
			System.out.println("Welcome you"   +uname1  +"Sucessufully login in application");
			  RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");  
		        rd.forward(request, response); 
		}
		else{
			System.out.println("Incorrct username or password");
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
	        rd.include(request, response);
		}
	}

}
