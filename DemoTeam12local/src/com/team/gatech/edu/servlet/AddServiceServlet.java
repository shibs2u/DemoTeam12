package com.team.gatech.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.gatech.edu.dao.LoginDao;
import com.team.gatech.edu.dao.ServicesDao;
import com.team.gatech.edu.model.SiteDetail;
import com.team.gatech.edu.dao.CreatclientDAO;

public class AddServiceServlet extends HttpServlet {


	    private static final long serialVersionUID = 1L;
	    List<SiteDetail> list = new ArrayList<SiteDetail>();

	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	    {  
	    	String choice=req.getParameter("service");
  		  resp.setContentType("text/html");  
  	      PrintWriter out = resp.getWriter(); 
  	      HttpSession session = req.getSession(false);
  	      int siteid=(int) session.getAttribute("siteid");
  	      
  		
  		System.out.println("Inside  Add service Servlet: Chise selected is "+ choice);
  		
  	
				 if (ServicesDao.addServices(choice,siteid)){  	 
			        	System.out.println("add done______");
			            RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
			            rd.forward(req,resp);  
			            
			        
			        }  

				
		

			
  	}
  
 
	        
	    	}
	    
	   
	    	

	    	
	    
	