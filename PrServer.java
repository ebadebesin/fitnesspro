/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prserver;
import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.*;
import java.sql.*;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author ebadebesin
 */
public class PrServer {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connection con = new connection();
        
        con.start();
        
        System.out.println("Connected");
        
      

     }
    
}
class connection extends Thread{
    public void run(){
        int port= 8082;
       try{
                  
          System.out.println("Congrats! Your server is up and running!");  
          ServerSocket serverSocket = new ServerSocket(port);

                while (true) {
    
                Socket clientSocketConnection = serverSocket.accept();
                //Send message to a client
            System.out.println("Congrats! You are connected to the server!");
                }
            }catch(Exception e){
            System.out.println("Exception caught: " + e);
        }
    }

}