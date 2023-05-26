package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 
/*		 if (username.equalsIgnoreCase("mysura") && password.equals("reddy")) 
		 {	writer.println("Login success...."+username);	
		 } 
		 else 
		 {	writer.println("Login Unsuccess....");
		 }
*/		 
		
	// I want redirect to link
		 
/*		 if (username.equalsIgnoreCase("mysura") && password.equals("reddy")) 
		 {	response.sendRedirect("https://www.facebook.com/");
			
		 } 
		 else 
		 {	response.sendError(800,"Login fail Try valid input....");

		 }
*/		 
		 

/*		 
		 if (username.equalsIgnoreCase("mysura") && password.equals("reddy")) 
		 {	RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
		 	dispatcher.forward(request, response);
		 } 
		 else 
		 {	RequestDispatcher dispatcher = request.getRequestDispatcher("fail.html");
		 	dispatcher.forward(request, response);
		 }
*/
		 
	// If username and password success I want to send hyper link
		 
		 if (username.equalsIgnoreCase("mysura") && password.equals("reddy")) 
		 {	writer.println("<a href='https://www.facebook.com/'>Click hear to get the facebook</a>");	
		 } 
		 else 
		 {	writer.println("<a href='failServlet'>Click hear to get the fail information</a>");
		 }
		 
		 
		 
		 
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
