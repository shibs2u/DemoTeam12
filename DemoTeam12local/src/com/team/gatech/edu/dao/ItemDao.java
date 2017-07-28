package com.team.gatech.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.team.gatech.edu.model.SiteDetail;
import com.team.gatech.edu.model.item;

public class ItemDao {

  
	  
	public static boolean persistItem(ArrayList<item> obj) {
		
	        
		  	Connection conn = null;
	        PreparedStatement pst1 = null;
	        PreparedStatement pst2 = null;
	        ResultSet rs1 = null;
	        ResultSet rs2 = null;
	        String querystr = null;
	        boolean status = true;
	        int Itemid = 0,userID = 0;
	        try {

	        	conn = DBUtil.getConnection();
	        	
	        	 pst1 = conn.prepareStatement("SELECT itemid FROM cs6400_sp17_team012.item where item_name=?");
	        	 pst1.setString(1, obj.get(0).getItemDesc());
	        	 rs1 = pst1.executeQuery();
	        	 if (rs1.next()) {
	        		 Itemid=rs1.getInt("itemID");
	     
	        	 }
	        	 pst1 = conn.prepareStatement("SELECT userID FROM cs6400_sp17_team012.user where name = 'Jonas'");
	        
	        	 rs1 = pst1.executeQuery();
	        	 if (rs1.next()) {
	        		 userID=rs1.getInt("userID");
	     
	        	 }
	        	

	        	 querystr="INSERT INTO request(`userId`,`itemId`,`status`,`num_requested`,`num_approved`) VALUES (?,?,'Approved',?,?)";
	        	 pst2 = conn.prepareStatement(querystr);
	        	 pst2.setInt(1,userID );
	        	 pst2.setInt(2, Itemid);
	        	 pst2.setInt(3, obj.get(0).getQty());
	        	 pst2.setInt(4, obj.get(0).getQty());
	        	  pst2.executeUpdate();
	        	 //status = rs2.next();
	        	 
	   
	        } catch (Exception e) {
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
	            if (pst1 != null) {
	                try {
	                    pst1.close();
	                    pst2.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (rs1 != null) {
	                try {
	                    rs1.close();
	                 //   rs2.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	 

		
		return status;
	}
	
}



