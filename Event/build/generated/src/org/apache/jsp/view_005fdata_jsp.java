package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public final class view_005fdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//for delete\r\n");
      out.write("\r\n");
      out.write("\r\n");

try
{ 
 Class.forName("com.mysql.jdbc.Driver");  //load driver 
 
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");  //create connection 

 if(request.getParameter("delete")!=null)
 {
  int id=Integer.parseInt(request.getParameter("delete"));
  
  PreparedStatement pstmt=null; //create statement
  
  pstmt=con.prepareStatement("delete from loginstudent where id=? "); //sql delete query
  pstmt.setInt(1,id);
  pstmt.executeUpdate(); //execute query
  
  con.close(); //close connection
 }
}
catch(Exception e)
{
 out.println(e);
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  \r\n");
      out.write(" .main\r\n");
      out.write(" {\r\n");
      out.write("  width:700px;;\r\n");
      out.write("  margin-left:250px;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  border: 5px solid grey;\r\n");
      out.write("   \r\n");
      out.write(" }\r\n");
      out.write(" table\r\n");
      out.write(" {\r\n");
      out.write("  font-family: arial, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 600px;\r\n");
      out.write(" }\r\n");
      out.write(" td\r\n");
      out.write(" {\r\n");
      out.write("  border: 5px solid silver;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write(" }\r\n");
      out.write("</style>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Hello World!</h1>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("  <table>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <th>ID</th>\r\n");
      out.write("    <th>Name</th>\r\n");
      out.write("    <th>Usertype</th>\r\n");
      out.write("    <th>email</th>\r\n");
      out.write("    <th>Username</th>\r\n");
      out.write("    <th>Password</th>\r\n");
      out.write("   </tr>\r\n");
      out.write("  ");

  
  try
  { 
   Class.forName("com.mysql.jdbc.Driver");  //load driver 
   
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");  //creat connection 

   PreparedStatement pstmt=null; //create statement
  
   pstmt=con.prepareStatement("select * from loginstudent"); //sql select query 
   
   ResultSet rs=pstmt.executeQuery(); //execute query and set in resultset object rs.  
  
   while(rs.next())
   { 
  
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td> ");
      out.print(rs.getString(1));
      out.write(" </td>   \r\n");
      out.write("     <td> ");
      out.print(rs.getInt(2));
      out.write(" </td>\r\n");
      out.write("     <td> ");
      out.print(rs.getString(3));
      out.write(" </td>\r\n");
      out.write("     <td> ");
      out.print(rs.getString(4));
      out.write(" </td>\r\n");
      out.write("     <td> ");
      out.print(rs.getString(5));
      out.write(" </td>\r\n");
      out.write("     <td> ");
      out.print(rs.getString(6));
      out.write(" </td>\r\n");
      out.write("     \r\n");
      out.write("     <td> <a href=\"update.jsp?edit=");
      out.print(rs.getInt(2));
      out.write(" \">Edit</a> </td>\r\n");
      out.write("     <td> <a href=\"?delete=");
      out.print(rs.getInt(2));
      out.write(" \">Delete</a> </td>\r\n");
      out.write("     \r\n");
      out.write("    </tr>\r\n");
      out.write("  ");

   }
   
  }
  catch(Exception e)
  {
   out.println(e);
  }
  
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </table>\r\n");
      out.write("  \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
