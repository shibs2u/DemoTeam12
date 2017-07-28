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

import com.team.gatech.edu.dao.ItemDao;
import com.team.gatech.edu.dao.LoginDao;
import com.team.gatech.edu.model.item;



public class SiteValueServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
       
        ArrayList<item> obj = new ArrayList<item>();
        item a = new item();
        a.setItemDesc(request.getParameter("foodType1"));	
        a.setQty(Integer.parseInt(request.getParameter("qty1")));
        obj.add(a); 
        item b = new item();
        b.setItemDesc(request.getParameter("foodType2"));	
        b.setQty(Integer.parseInt(request.getParameter("qty2")));
        obj.add(b);
        item c = new item();
        c.setItemDesc(request.getParameter("foodType3"));	
        c.setQty(Integer.parseInt(request.getParameter("qty3")));
        obj.add(c);
        item d = new item();
        d.setItemDesc(request.getParameter("foodType4"));	
        d.setQty(Integer.parseInt(request.getParameter("qty4")));
        obj.add(d);
        
        if (ItemDao.persistItem(obj)){
        	System.out.println("here______");
            RequestDispatcher rd=request.getRequestDispatcher("clientrequest.jsp");
            rd.forward(request,response);  
        }
        
        

    }  
} 
