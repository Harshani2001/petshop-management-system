/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pathum Sri
 */
public class DbConnnection {
    
    public static Connection myCon() throws SQLException{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop_db","root","");
            return con;
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
}
