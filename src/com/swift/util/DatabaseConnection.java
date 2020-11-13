package com.swift.util;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
public class DatabaseConnection { 
  
    private static Connection con = null; 
  
    static
    { 
        String url = "jdbc:mysql:// localhost:3306/org";  // database url postgres://zkfmbjiw:L_7v_AO-1vRNOnWAnJ054FpR2a0k-99H@topsy.db.elephantsql.com:5432/zkfmbjiw 
        String user = "root"; 	//database user  zkfmbjiw
        String pass = "root"; 	//database password  	L_7v_AO-1vRNOnWAnJ054FpR2a0k-99H
        
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection(url, user, pass); 
        } 
        catch (ClassNotFoundException | SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
    public static Connection getConnection() 
    { 
        return con; 
    } 
} 