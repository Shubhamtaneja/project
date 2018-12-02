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
 * @author dell
 */
public class RecordCheck {
    
    public void insert(String id,int sid,String usertype,String first,String last,String pass) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");  
        PreparedStatement ps = con.prepareStatement("insert into loginstudent values(?,?,?,?,?,?)");
        ps.setString(1, id);
        ps.setInt(2, sid);
        ps.setString(3, usertype);
        ps.setString(4, first);
        ps.setString(5, last);
        ps.setString(6,pass);
        int rs=ps.executeUpdate();
    }    
}
