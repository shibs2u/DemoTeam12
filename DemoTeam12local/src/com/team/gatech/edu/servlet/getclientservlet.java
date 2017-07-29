package com.team.gatech.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.gatech.edu.model.SiteDetail;
import com.team.gatech.edu.model.client;
import com.team.gatech.edu.model.item;
import com.team.gatech.edu.dao.ServicesDao;
import com.team.gatech.edu.dao.UpdateclientservletDao;

public class getclientservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<SiteDetail> list = new ArrayList<SiteDetail>();

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        
        String cname=request.getParameter("clientname");  
        String phone=request.getParameter("phone"); 
        String id = request.getParameter("id"); 
        
        int iid = Integer.parseInt(id);
        
        System.out.println("name is" + cname + "Phone is :" + phone + "id is :" + iid);
        
        
        HttpSession session = request.getSession(false);
        //if(session!=null) 
        //session.setAttribute("name", n);
        
        ArrayList<client> arrlst = new ArrayList<client>();
        client Client = new client();
        Client.setClientname(cname);
        Client.setPhone(phone);
        Client.setId(iid);
        arrlst.add(Client);
        
       //int alength=arrlst.size();
       //System.out.println(alength);
       //for(int i=0; i<alength; i++){
           //System.out.println("Clientinfo: " + arrlst.get(i).toString());
      //}
       
       // if(
        	UpdateclientservletDao.clientupdate(cname, phone, iid);
            RequestDispatcher rd=request.getRequestDispatcher("updateresult.jsp");
            rd.forward(request,response);  
            
       // }  
       // else{  
           // out.print("<p style=\"color:red\">Sorry username or password error</p>");  
           // RequestDispatcher rd=request.getRequestDispatcher("updateresult.jsp");  
            //rd.include(request,response);  
        }  
    }
       //private List retrieveData(String choice) {
		  //list = ServicesDao.retrieveRecords(choice);
		  //return list;
			
    //}
//}
