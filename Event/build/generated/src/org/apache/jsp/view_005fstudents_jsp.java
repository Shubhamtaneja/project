package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public final class view_005fstudents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags-->\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\r\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Title Page-->\r\n");
      out.write("    <title>Delete Student</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Font special for pages-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main CSS-->\r\n");
      out.write("    <link href=\"edit_student/css/main.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    \r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("th:nth-child(even) {background-color: #9c33ff;}\r\n");
      out.write("th:nth-child(odd) {background-color: #9c33ff;}\r\n");
      out.write("tr:nth-child(even) {background-color: #f2f2f2;}\r\n");
      out.write("tr:nth-child(odd) {background-color: #f2f2f2;}</style>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#33ffdd\">\r\n");
      out.write("    <div class=\"page-wrapper bg-gra-01 p-t-180 p-t-100 p-b-50\">\r\n");
      out.write("        <div class=\"wrapper wrapper--w780\">\r\n");
      out.write("            <div class=\"card card-6\">\r\n");
      out.write("                <div class=\"card-heading\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    <h2 class=\"title\"><h1>List OF Students</h1></h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <form method=\"POST\">\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("\r\n");
      out.write("  <table>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <th>Name</th>\r\n");
      out.write("    <th>Id</th>\r\n");
      out.write("    <th>Usertype</th>\r\n");
      out.write("    <th>email</th>\r\n");
      out.write("    <th>Username</th>\r\n");
      out.write("    <th>Password</th>\r\n");
      out.write("    <th>Select</th>\r\n");
      out.write("   \r\n");
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
      out.write("     \r\n");
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
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  <script src=\"edit_student/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Main JS-->\r\n");
      out.write("    <script src=\"edit_student/js/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
