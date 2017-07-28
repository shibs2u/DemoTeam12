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

public class ClientRequestServlet extends HttpServlet {


	    private static final long serialVersionUID = 1L;
	    List<SiteDetail> list = new ArrayList<SiteDetail>();

	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	    {  
	    		String choice=req.getParameter("service");
	    		
	    		System.out.println("Inside  Client Request Servlet: Chise selected is "+ choice);
	    		
	    		try {
					list=retrieveData(choice);
					RequestDispatcher rd=null;
					req.setAttribute("list",list);
					if (choice.equals("Food Pantry")){
					 rd= req.getRequestDispatcher("sitedetail.jsp");
					} else if (choice.equals("Shelter")){
					  rd= req.getRequestDispatcher("sitedetail_shelter.jsp");
					}else if (choice.equals("Soup Kitchen")){
						rd= req.getRequestDispatcher("sitedetail_soupk.jsp");
					}
					rd.forward(req, resp);
					
			

				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        
	    	}
	    
	   
	    	

	    	
	    
	
		private List retrieveData(String choice) {
			
			list = ServicesDao.retrieveRecords(choice);
			
			return list;
			
		}	
	    		
	    	
	    }
	    