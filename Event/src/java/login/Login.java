/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author HP
 */
public class Login extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String usertype = request.getParameter("usertype");
        
        PrintWriter out = response.getWriter();
       // out.println(email+""+password);
        //out.println(usertype);
        
        try {
            LoginDAO l = new LoginDAO();
            String result = l.checkInfo(email, password,usertype);
            out.println("Invalid Login Details");
            if(result.equals("admin"))
            {
               //RequestDispatcher rd= request.getRequestDispatcher("admin_home.html");
               // rd.forward(request,response);
                response.sendRedirect("admin_home.html");
            }
            else if(result.equals("Login successfull"))
            {
//                RequestDispatcher rd= request.getRequestDispatcher("home.html");
//                rd.forward(request,response);
                response.sendRedirect("student_home.html");
            }
            else
            {
                RequestDispatcher rd= request.getRequestDispatcher("index.html");
                rd.include(request,response);
            }
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }




}
