<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
 
<html>
    <head>
        <title>File Upload</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form method="POST" action="FileUploadPdf" enctype="multipart/form-data" >
<table>
        <tr><td>Book Id</td>
        <td><input type="text" name="bookId" /></td>
        <tr><td>Book Pdf</td>
            <td><input type="file" name="file" id="file" /> </td>
        </tr>
        <tr>
        <td colspan="2">
            <input type="submit" value="Upload" name="upload" id="upload" /> </td>
        </tr>
   </table>
        </form>
    </body>
</html>