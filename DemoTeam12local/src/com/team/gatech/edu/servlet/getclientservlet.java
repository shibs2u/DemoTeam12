package com.team.gatech.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.team.gatech.edu.model.client;
import com.team.gatech.edu.model.item;
import com.team.gatech.edu.dao.UpdateclientservletDao;

public class getclientservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        
        String cname=request.getParameter("clientname");  
        String phone=request.getParameter("phone"); 
        
       
        HttpSession session = request.getSession(false);
        //if(session!=null) 
        //session.setAttribute("name", n);
        
        ArrayList<client> arrlst = new ArrayList<client>();
        client Client = new client();
        Client.setClientname(cname);
        Client.setPhone(phone);
        arrlst.add(Client);
        
       //int alength=arrlst.size();
       //System.out.println(alength);
       //for(int i=0; i<alength; i++){
           //System.out.println("Clientinfo: " + arrlst.get(i).toString());
      //}
       
        if(UpdateclientservletDao.clientupdate(cname,phone)){  
        	System.out.println("here______");
            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
            rd.forward(request,response);  
            
        }  
        else{  
            out.print("<p style=\"color:red\">Sorry username or password error</p>");  
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            rd.include(request,response);  
        }  
       // if(LoginDao.validate(n, p
           //RequestDispatcher rd=request.getRequestDispatcher("Modifycl.jsp");
            //rd.forward(request,response);  
            
        //}  
        //else{  
          //  out.print("<p style=\"color:red\">Sorry username or password error</p>");  
            //RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            //rd.include(request,response);  
        //}  

        //out.close();  
    }  
} 

//}
