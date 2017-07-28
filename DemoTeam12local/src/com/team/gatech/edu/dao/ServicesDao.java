package com.team.gatech.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.team.gatech.edu.model.SiteDetail;

public class ServicesDao {

  
	  public static  List retrieveRecords(String choice) {        
		  List<SiteDetail> list = new ArrayList<SiteDetail>();
	        
		  	Connection conn = null;
	        PreparedStatement pst = null;
	        ResultSet rs = null;

	       
	        String querystr="";
	        
	        if (choice.equals("Soup Kitchen"))
	        {
	  			querystr="select * from site where siteId=(select siteid from cs6400_sp17_team012.service where soupkitchenid is not null);";
	        }else if (choice.equals("Shelter"))
	        {
	        	querystr="select * from site where siteId=(select siteid from cs6400_sp17_team012.service where shelterid is not null);";
	        }else if (choice.equals("Food Pantry"))
	        {
	        	querystr="select * from site where siteId=(select siteid from cs6400_sp17_team012.service where foodpantrryid is not null);";
	        }
	        	
	        try {

	        	conn = DBUtil.getConnection();
	            pst = conn
	                    .prepareStatement(querystr);

	            rs = pst.executeQuery();
	            
	            if (rs.next()) {
	            	SiteDetail siteDetail = new SiteDetail();
	            	siteDetail.setSiteID(rs.getInt("siteID"));
	            	siteDetail.setName(rs.getString("name"));
	            	siteDetail.setPhone_number(rs.getString("phone_number"));
	            	siteDetail.setStreet_address(rs.getString("street_address"));
	            	siteDetail.setCity(rs.getString("city"));
	            	siteDetail.setState(rs.getString("state"));
	            	siteDetail.setZipcode(rs.getString("zip_Code"));

	                list.add(siteDetail);
	            }

	            

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
	        return list;
	  
	    }
	}



