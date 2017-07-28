package com.team.gatech.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.team.gatech.edu.dao.ModifyclientDao;

//import com.team.gatech.edu.dao.LoginDao;
//import com.team.gatech.edu.dao.ModifyclientDAO;

public class Modifyclientservlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
    {  
		resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
    	String searchcriteria=req.getParameter("pid");
    	ArrayList clientarray = new ArrayList<String>();
    	
    	HttpSession session = req.getSession(false);    
    		
      		if(searchcriteria!=null && session!=null)
    		  {
      			
      			session.setAttribute("pid", searchcriteria);
      			clientarray = ModifyclientDao.ModifyDao(searchcriteria);
      			
      			if(clientarray!=null) {  
      	        	//System.out.println("here______");
      			    req.setAttribute("piList", clientarray);
      	            RequestDispatcher rd=req.getRequestDispatcher("Modifyclientindex.jsp");
      	            rd.forward(req,resp); }
      			
      			else
      			{
      				System.out.println("No Records returned");
      	        } 
    		  }
    		else
      {
    	  System.out.println("Search criteria is empty");
      }
   
    
    }
}
