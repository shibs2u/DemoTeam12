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
import com.team.gatech.edu.model.SiteDetail;

public class WelcomeServlet extends HttpServlet{
	
	 private static final long serialVersionUID = 1L;
	 List<SiteDetail> list = new ArrayList<SiteDetail>();
	
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
			request.setAttribute("list",list);

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
    

	private List<SiteDetail> retrieveDatabyUser(String user) {
		list = ServicesDao.retrieveRecordsByuser(user);
		return list;
	}
}

