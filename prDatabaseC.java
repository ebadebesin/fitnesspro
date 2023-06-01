/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prclient;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ebadebesin
 */
public class prDatabaseC {
    String url = "jdbc:postgresql://localhost:2301/prDatabase";
    String user = "postgres";
    String password = "Bunsin#1234";
    
    //get connection
    public Connection connectToprDB(){
        try{
           Class.forName("org.postgresql.Driver");
           String database = "jdbc:postgresql://localhost:2301/prDatabase";
           Connection con = DriverManager.getConnection(database, "postgres", "Bunsin#1234");
           
           return con;
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Connection Error, Check Database Connection");
            System.out.println(ex);
            return null;                                                                                  
        }
        
        //System.out.println("Opened database successfully");
    }
    
    //execute data
    public boolean data(String theSql){
        boolean boo;
        try{
            Connection con = connectToprDB();
            Statement sta = con.createStatement();
            sta.executeUpdate(theSql);
            con.close();
            boo = true;
        } catch (Exception ex){
            ex.printStackTrace();
            boo = false;
        }
        return boo;
    }
    
    //get data
   public ResultSet getDB(String theSql){
         try{
            Connection con = connectToprDB();
            Statement sta = con.createStatement();
            ResultSet res= sta.executeQuery(theSql);
            return res;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
}
