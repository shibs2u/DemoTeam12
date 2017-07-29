package com.team.gatech.edu.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModifyclientDao {
	
	public static ArrayList<String> ModifyDao (String searchval)
	
	{
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;


        ArrayList al = null;
        ArrayList pid_list = new ArrayList();
       
        System.out.println(searchval);
        
        try {

            //System.out.println("Connected!");
            //String pid = request.getParameter("pid");
        	 conn = DBUtil.getConnection();
            pst = conn
                    .prepareStatement("Select clientid,client_name,phonenumber from client where client_name=? order by client_name desc limit 4;");
             pst.setString(1, searchval);
           

            rs = pst.executeQuery();
            System.out.print(pst.toString());
 
            while (rs.next()) {
            	 al = new ArrayList();
               
                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));
                
                //System.out.println("al :: " + al);
                 pid_list.add(al);
               
            }
        }
        
            catch (Exception e) {
	            System.out.println(e);
	        } finally {
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    System.out.println("Connection not made");
	                }
	            }
	            if (pst != null) {
	                try {
	                    pst.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (rs != null) {
	                try {
	                    rs.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	               
	            }
	        }
	            return pid_list;
	           
	        }
	}
        

	


