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

public class SiteMaintenanceServlet extends HttpServlet {


	    private static final long serialVersionUID = 1L;
	    

	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	    {  
	    		String user=req.getParameter("userid");
	    		boolean fp,sk,sh = false;
	    	    HttpSession session = req.getSession(false);
	    	    String btnvalue = req.getParameter("kb");
	    	    

	    		fp=(boolean) session.getAttribute("isfoodpantry");
	    		sk=(boolean) session.getAttribute("issoupkitchen");
	    		sh=(boolean) session.getAttribute("isshelter");
	    		resp.setContentType("text/html");  
	    	    PrintWriter out = resp.getWriter();  
	    		
	    		System.out.println("Inside  Site Maintenance Servlet: user selected is "+ fp +sk + sh);
	    		
	    		
	    		
	    		if (btnvalue.equals("Add Services")){
	    			
	    			if ((fp) && (sk) && (sh)){
		    			out.print("<p style=\"color:red\">No additional Services Available</p>");  
		                RequestDispatcher rd=req.getRequestDispatcher("sitemaintenance.jsp");  
		                rd.include(req,resp);  
		    		} else {
		    			req.getServletContext().getRequestDispatcher("/addservices.jsp").forward(req, resp);
		    		}
		    			
	    			
	    		} else if (btnvalue.equals("Delete Services")){
	    			
	    			if (!((fp) || (sk) || (sh))){
		    			out.print("<p style=\"color:red\">At least one service should be available</p>");  
		                RequestDispatcher rd=req.getRequestDispatcher("sitemaintenance.jsp");  
		                rd.include(req,resp);  
		    		} else {
		    			req.getServletContext().getRequestDispatcher("/deleteservices.jsp").forward(req, resp);
		    		}
	    			
	    		}
	    	
	    		
	    		
	        
	    	}
	    
	   
	    	

	    	
	    
	
	





	    		
	    	
	    }
	    