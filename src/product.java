
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class product {
    String forname=  "com.mysql.jdbc.Driver";
   String driver = "jdbc:mysql://localhost/bsit23";
   String us = "root";
   String ps1 ="";
   String name;
   public void add(String p,int qty,float pr){
        try {
            Class.forName(forname);
      PreparedStatement ps = DriverManager.getConnection(driver,us,ps1).prepareStatement("insert into product values(null,?,?,?)");
      ps.setString(1, p);
      ps.setInt(2, qty);
      ps.setFloat(3, pr);
      ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   
   public void delete(int id){
        try {
            Class.forName(forname);
            Connection con =DriverManager.getConnection(driver,us,ps1);
            PreparedStatement ps =con.prepareStatement("delete from product where prod_id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
   }
   
   

