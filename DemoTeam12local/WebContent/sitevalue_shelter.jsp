<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--<title>Login Application</title>-->
<!--<center><h1>Create Client</h1> </center>-->

<br>
</head>
<body>



    <form action="SiteValueServlet_shelter" method="post">
        <!--<fieldset style="width: 300px">-->
        
        
            <h2><center><legend> Service Request Form for Shelter: Please select Choices </legend></center></h2>
            
            <table width="100%" border="0" cellspacing="0" cellpadding="0">

              
                <tr>
                    <td>Bunk Beds</td>
                    <td><input type="Bunk bed" name="bunkbeds1" required="required" /></td>
             
            
                    <td>Qty</td>
                    <td><input type="Qty required" name="qty1" required="required" /></td>
             
                 
                    <td>Type of room</td>
                    <td><input type="room type" name="roomtype1" required="required" /></td>
                 </tr>
                
                 
                
                <tr>
                    <td><input type="submit" value="Submit" align="center" /></td>
                </tr>
       
</table>
            
       
    		
		
  
    </form>
</body>
</html>