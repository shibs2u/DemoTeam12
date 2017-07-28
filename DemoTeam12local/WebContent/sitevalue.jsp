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



    <form action="SiteValueServlet" method="post">
        <!--<fieldset style="width: 300px">-->
        
        
            <h2><center><legend> Service Request Form for Food Pantry: Please select Choices </legend></center></h2>
            
            <table width="100%" border="0" cellspacing="0" cellpadding="0">

              
                <tr>
                    <td>Food Item</td>
                    <td><input type="Food Item" name="foodType1" required="required" /></td>
             
            
                    <td>Qty</td>
                    <td><input type="Qty required" name="qty1" required="required" /></td>
                </tr>
                 <tr>
                    <td>Food Item</td>
                    <td><input type="Food Item" name="foodType2" required="required" /></td>
                
                
                    <td>Qty</td>
                    <td><input type="Qty required" name="qty2" required="required" /></td>
                </tr>
                 <tr>
                    <td>Food Item</td>
                    <td><input type="Food Item" name="foodType3" required="required" /></td>
                
                
                    <td>Qty</td>
                    <td><input type="Qty required" name="qty3" required="required" /></td>
                </tr>
                 <tr>
                    <td>Food Item</td>
                    <td><input type="Food Item" name="foodType4" required="required" /></td>
               
                
                    <td>Qty</td>
                    <td><input type="Qty required" name="qty4" required="required" /></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit" align="center" /></td>
                </tr>
       
</table>
            
       
    		
		
  
    </form>
</body>
</html>