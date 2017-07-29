package com.team.gatech.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

public class CreatclientDAO {
	    
        public static boolean clientinsert(String name, String phone) {        
            boolean status = false;
            Connection conn = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "cs6400_sp17_team012";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "root";
            try {
                Class.forName(driver).newInstance();
                conn = DriverManager
                        .getConnection(url + dbName, userName, password);

                pst = conn.prepareStatement("INSERT INTO client (Siteid,client_Name,phoneNumber) VALUES (1,?,?)");
                pst.setString(1, name);
                pst.setString(2, phone);

                pst.executeUpdate();
                //status = rs.next();

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




