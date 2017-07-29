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
	    List<SiteDetail> list = new ArrayList<SiteDetail>();

	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	    {  
	    		String user=req.getParameter("userid");
	    		
	    		System.out.println("Inside  Site Maintenance Servlet: user selected is "+ user);
	    		
	    		try {
					list=retrieveDatabyUser(user);
					RequestDispatcher rd=null;
					req.setAttribute("list",list);

					rd.forward(req, resp);
					
			

				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        
	    	}
	    
	   
	    	

	    	
	    
	
		private List<SiteDetail> retrieveDatabyUser(String user) {
			list = ServicesDao.retrieveRecordsByuser(user);
			return null;
		}






	    		
	    	
	    }
	    