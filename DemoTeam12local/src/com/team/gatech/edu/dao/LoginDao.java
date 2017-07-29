package com.team.gatech.edu.dao;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class LoginDao {
	    public static boolean validate(String name, String pass) {        
	        boolean status = false;
	        Connection conn = null;
	        PreparedStatement pst = null;
	        ResultSet rs = null;

	       
	        try {
	          
	           
	            conn = DBUtil.getConnection();
	            pst = conn
	                    .prepareStatement("select * from user where name=? and password=?");
	            pst.setString(1, name);
	            pst.setString(2, pass);

	            rs = pst.executeQuery();
	            status = rs.next();

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
	        return status;
	    }
	}


