package com.team.gatech.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.gatech.edu.dao.UpdateclientservletDao;;



public class Updateclientservlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        
        String cname=request.getParameter("clientname");  
        String phone=request.getParameter("phone"); 
        
        HttpSession session = request.getSession(false);
        if(session!=null)
        //session.setAttribute("name", n);

        if(UpdateclientservletDao.clientupdate(cname, phone)){  
        	//System.out.println("here______");
            //RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
            //rd.forward(request,response); 
        	out.print("<p style=\"color:red\">Client Update successful</p>");  
            
        }  
        else{  
            out.print("<p style=\"color:red\">Sorry username or password error</p>");  
            //RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            //rd.include(request,response);  
        }  

        out.close();  
    }  
} 




