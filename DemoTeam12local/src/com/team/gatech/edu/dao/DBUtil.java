package com.team.gatech.edu.dao;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
public class DBUtil {
 
    private static Connection conn =null;
 
    public static Connection getConnection() {
/*        if( conn != null )
            return conn;*/
 
            try {
				String url = "jdbc:mysql://localhost:3306/";
				String dbName = "cs6400_sp17_team012";
				String driver = "com.mysql.jdbc.Driver";
				String userName = "root";
				String password = "";


				Class.forName(driver).newInstance();
				conn = DriverManager.getConnection( url + dbName, userName, password );
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

 
        return conn;
    }
 
    public static void closeConnection( Connection toBeClosed ) {
        if( toBeClosed == null )
            return;
        try {
            toBeClosed.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}