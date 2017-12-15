/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entworld;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Minerva
 */
public class JDBC {
        Connection con = null;
    JDBC()
    {
    
                
                try{ 
                        //step-1 => Load The Driver. 
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("Driver Loded"); 

                       //step-2=> GetConnection
                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entworld","root", "root");
                       System.out.println("Connection Established");
                    }
                catch(Exception e)
                    {
                        System.out.println("Record Failed");
                        e.printStackTrace();
                    }
    }
    
    public void register(String name,String email, Long mob, Float bal)
    {
            //step-3=> Get Statement Object
           try
           {
                
                PreparedStatement ps = con.prepareStatement("insert into userreg (Name,Mobile_No,Balance,EmailID) values (?,?,?,?);");
                ps.setString(1,name);
                ps.setLong(2, mob);
                ps.setFloat(3, bal);
                ps.setString(4, email);
           
           
                //step-4=>Execute the query
                int r = ps.executeUpdate();
                if(r>0)
                 System.out.println("Record Inserted");
                else
                 System.out.println("Record Failed");
    
           }
            catch(Exception e)
            {
               System.out.println("Record Failed");
               e.printStackTrace();
            }
           
        
 } 
    
    public void transaction(String Name, String Trans_type, Float Trans_amount,Float balance)
    {
        try
           {
                
                PreparedStatement ps = con.prepareStatement("insert into userxns (EMAILID,XNS_TYPE,xns_DATE,balance) values (?,?,?,?);");
                ps.setString(1,Name);
                ps.setString(2, Trans_type);
                ps.setFloat(3, Trans_amount);
                ps.setFloat(4, balance);
           
           
                //step-4=>Execute the query
                int r = ps.executeUpdate();
                if(r>0)
                 System.out.println("Record Inserted");
                else
                 System.out.println("Record Failed");
    
           }
            catch(Exception e)
            {
               System.out.println("Record Failed");
               e.printStackTrace();
            }
    }     
    
    public void viewTrans()
    {
        try
        {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM transaction;");
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next())
            {
                rs.getString(i);
                i++;
            }
            
    
    
        }
        catch(Exception e)
        {
            System.out.println("Record entry failed");
            e.printStackTrace();
                  
        
        }
    }

        @Override
    public void finalize()
    {
        
              try{ 
               //step-5=> Close the connection.
               con.close();
               System.out.println("Connection closed");
              }
              catch(Exception e)
              {
                 e.printStackTrace();
              }
              
            
    }
}   
           
    

