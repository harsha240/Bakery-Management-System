
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hs247
 */
public class dbconnect {
   static Connection con = null;
   public static Connection ConnecrDB()   {
       try {
           Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("Jdbc:sqlite:E:\\java project\\Bakery management system\\bakery.sqlite");
        JOptionPane.showMessageDialog(null, "connection established!");   
         return con;
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
    
}
