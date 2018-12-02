/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @author Shubham Taneja
 */
public class LoginDAO {
    String user;
    String url;
    String password;
    Connection con;
    Statement st;
    LoginDAO() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.user="root";
        this.url="jdbc:mysql://localhost:3306/event";
        this.password="";
    
        this.con=DriverManager.getConnection(url, user, password);
        this.st=con.createStatement();
    }
   
    public String checkInfo(String email,String password,String usertype) throws SQLException
    {
         //String admin="Select * from login where email='"+email+"' and password ='"+password+"'";
        if(usertype.equals("admin"))
        {
            String query="Select * from login where email='"+email+"' and password ='"+password+"'";
        
        ResultSet rs=st.executeQuery(query);
                while(rs.next())
                {
                    return "admin";
                }
        }
        else if(usertype.equals("student"))
        {
            String query="Select * from loginstudent where email='"+email+"' and password ='"+password+"'";
        
        ResultSet rs=st.executeQuery(query);
                while(rs.next())
                {
                     return "Login successfull";
                }
        }
        
        
        return "invalid login details";
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        LoginDAO l = new LoginDAO();
        String result = l.checkInfo("shubham@gmail.com", "password","admin");
        System.out.println(result);
    }
    
}
