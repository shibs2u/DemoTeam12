package com.team.gatech.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	
	 private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
        
     
		String btnvalue = request.getParameter("kb");
		System.out.println(btnvalue);

    if (btnvalue.equals("Create Client"))
      {
    	//RequestDispatcher rd=request.getRequestDispatcher("Createclient.jsp");
    	request.getServletContext().getRequestDispatcher("/createclient.jsp").forward(request, response);
      }

    else if(btnvalue.equals("Update Client"))
    {
    	request.getServletContext().getRequestDispatcher("/Modifyclientindex.jsp").forward(request, response);
    }
    
    else if(btnvalue.equals("Delete"))
    {
        
    }
    else if(btnvalue.equals("Client Request"))
    {
    	request.getServletContext().getRequestDispatcher("/clientrequest.jsp").forward(request, response);
    }
    else if(btnvalue.equals("Site Maintenance"))
    {
    	request.getServletContext().getRequestDispatcher("/sitemaintenance.jsp").forward(request, response);
    }
}
}
