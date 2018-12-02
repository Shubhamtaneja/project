<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>

<%
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
%>


<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Delete Student</title>

    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Main CSS-->
    <link href="edit_student/css/main.css" rel="stylesheet" media="all">
    
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}
th:nth-child(even) {background-color: #9c33ff;}
th:nth-child(odd) {background-color: #9c33ff;}
tr:nth-child(even) {background-color: #f2f2f2;}
tr:nth-child(odd) {background-color: #f2f2f2;}</style>
    
</head>
<body bgcolor="#33ffdd">
    <div class="page-wrapper bg-gra-01 p-t-180 p-t-100 p-b-50">
        <div class="wrapper wrapper--w900">
            <div class="card card-6">
                <div class="card-heading">
                    

                    <h2 class="title"><h1>List OF Students</h1></h2>
                </div>
                <div class="card-body">
                    <form method="POST">
                        
                        
                        <div class="form-row">
                            
                            <div class="value">
                                <div class="input-group">

  <table>
  
   <tr>
    <th>Name</th>
    <th>Id</th>
    <th>Usertype</th>
    <th>email</th>
    <th>Username</th>
    <th>Password</th>
    <th>Select</th>
   
   </tr>
  <%
  
  try
  { 
   Class.forName("com.mysql.jdbc.Driver");  //load driver 
   
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");  //creat connection 

   PreparedStatement pstmt=null; //create statement
  
   pstmt=con.prepareStatement("select * from loginstudent"); //sql select query 
   
   ResultSet rs=pstmt.executeQuery(); //execute query and set in resultset object rs.  
  
   while(rs.next())
   { 
  %>
    <tr>
     <td> <%=rs.getString(1)%> </td>   
     <td> <%=rs.getInt(2)%> </td>
     <td> <%=rs.getString(3)%> </td>
     <td> <%=rs.getString(4)%> </td>
     <td> <%=rs.getString(5)%> </td>
     <td> <%=rs.getString(6)%> </td>
     
     
     <td> <a href="?delete=<%=rs.getInt(2)%> ">Delete</a> </td>
     
    </tr>
  <%
   }
   
  }
  catch(Exception e)
  {
   out.println(e);
  }
  
  %>
  
  </table>
  
                                </div>
                            </div>
                        </div>
                        
                    </form>
                </div>
                
            </div>
        </div>
    </div>
  <script src="edit_student/vendor/jquery/jquery.min.js"></script>


    <!-- Main JS-->
    <script src="edit_student/js/global.js"></script>

</body>
</html>
