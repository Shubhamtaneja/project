/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shubham
 */
public class checkevent extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        String name = req.getParameter("name");
        String date = req.getParameter("date");
        String venue=req.getParameter("venue");
        String head=req.getParameter("head");
        String phone = req.getParameter("phone");
        //int phone=1234567890;
        System.out.println("chk 1");
        
        System.out.println(date);
        
         RecordCheckEvent rs = new RecordCheckEvent();
        try {
            rs.insert(name, date,venue, head, phone);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
