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

import com.team.gatech.edu.dao.ServicesDao;
import com.team.gatech.edu.model.Services;
import com.team.gatech.edu.model.SiteDetail;

public class WelcomeServlet extends HttpServlet{
	
	 private static final long serialVersionUID = 1L;
	 List<SiteDetail> list = new ArrayList<SiteDetail>();
	 List<Services> slist = new ArrayList<Services>();
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
        
     
		String btnvalue = request.getParameter("kb");
		System.out.println(btnvalue);
		
	    HttpSession session = request.getSession(false);
		
		String user=(String) session.getAttribute("name");

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
    	
		
		System.out.println("Inside  Site Maintenance : user selected is "+ user);
		
		try {
			list=retrieveDatabyUser(user);
			RequestDispatcher rd=null;
			 boolean isfoodpantry = false;
			 boolean isshelter = false;
			 boolean issoupkitchen =false;
			request.setAttribute("list",list);
			System.out.println("Siteid is " + list.get(0).getSiteID() );
			if(session!=null)
		        session.setAttribute("siteid", list.get(0).getSiteID());
			
			slist=retrieveServicesData(list.get(0).getSiteID());
			
			for (int i = 0; i < slist.size(); i++) {
			    System.out.println(slist.get(i));
			    
			    if (slist.get(i).getFoodpantryId()!=0){
			    	System.out.println("In loop:"+ slist.get(i).getFoodpantryId());
					 isfoodpantry=true;
				 }
				 if (slist.get(i).getSoupkitchenid()!=0){
					 issoupkitchen=true;
				 }
				 if (slist.get(i).getShelterid()!=0){
					 isshelter=true;
				 }
			}
			
			  session = request.getSession(false);
		        
		        if(session!=null)
		        session.setAttribute("isfoodpantry", isfoodpantry);
		        session.setAttribute("issoupkitchen", issoupkitchen);
		        session.setAttribute("isshelter", isshelter);
			
			request.setAttribute("isfoodpantry",isfoodpantry);
			request.setAttribute("issoupkitchen",issoupkitchen);
			request.setAttribute("isshelter",isshelter);
			request.getServletContext().getRequestDispatcher("/sitemaintenance.jsp").forward(request, response);
			
	

		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	}

	} 	
    

	private List<Services> retrieveServicesData(int siteID) {
		slist = ServicesDao.retrieveServices(siteID);
		return slist;
	}


	private List<SiteDetail> retrieveDatabyUser(String user) {
		list = ServicesDao.retrieveRecordsByuser(user);
		return list;
	}
}

