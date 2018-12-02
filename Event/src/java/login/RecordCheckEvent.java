/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class RecordCheckEvent {
    public void insert(String name,String date,String venue,String head,String phone) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");  
        PreparedStatement ps = con.prepareStatement("insert into addevent values(?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, date);
        ps.setString(3, venue);
        ps.setString(4, head);
        ps.setString(5, phone);
       // ps.setInt(5, phone);
        int rs=ps.executeUpdate();
        
        System.out.println("chk 2");
        
        System.out.println(rs);
    }
    
}
