/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Apurva
 */
public class DBconnection {
   static Connection conn=null;
   static final String DBUrl="jdbc:mysql://localhost:3307/library";
   static final String username="root";
   static final String pass="";
   public static Connection connect()
   {
       
    try
      {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(DBUrl, username, pass);
            
      }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return conn;
   } 
   
    
}
