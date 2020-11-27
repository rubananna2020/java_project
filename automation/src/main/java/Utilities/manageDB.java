package Utilities;

import java.sql.DriverManager;
import java.sql.SQLException;

public class manageDB extends commonOps
{
 public static void initConnection(String dbURL, String user, String pass)
 {
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         con= DriverManager.getConnection(dbURL, user, pass);
         stmt=con.createStatement();
     }
     catch (Exception e)
     {
         System.out.println("Error while connecting to BD, see details: "+ e);
     }
 }

 public static void closeConnection()
 {
     try
     {
         con.close();
     }
     catch (Exception e)
     {
         System.out.println("Error while closing DB, see details: "+e);
     }
 }
}
