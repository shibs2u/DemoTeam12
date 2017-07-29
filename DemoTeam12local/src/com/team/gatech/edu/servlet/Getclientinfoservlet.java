package com.team.gatech.edu.servlet;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.gatech.edu.dao.CreatclientDAO;

public class Getclientinfoservlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    {  
    		String clientname=req.getParameter("usernme");
    		String client_phonenumber=req.getParameter("userphone");
    		
    		System.out.println("Calling Client Servlet");
       
    		if(clientname!=null && client_phonenumber!=null)
    		{
    			resp.setContentType("text/html");       
    	try
       {
    		CreatclientDAO.clientinsert(clientname, client_phonenumber);
    		 PrintWriter result = resp.getWriter();  
    		 
    		 RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
             rd.forward(req,resp);  
       }
       catch (Exception e) {
       
    	   e.printStackTrace();
       }
      }
    		else
      {
    	  System.out.println("Name or Phonenumber field is empty");
      }
      }
    }
	


