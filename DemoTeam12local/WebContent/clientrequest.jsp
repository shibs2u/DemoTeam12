<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--<title>Login Application</title>-->
<!--<center><h1>Create Client</h1> </center>-->
<br>
</head>
<body>
    <form action="ClientRequestServlet" method="post">
        <!--<fieldset style="width: 300px">-->
        
            <h2><center><legend> Client Request </legend></center></h2>
           
            <table align="center">
                <tr>
                    
                    <td><input type="radio" name="service" value="Food Pantry"  checked />Food Pantry</td>
                </tr>
                <tr>
                    <td><input type="radio" name="service" value="Shelter" />Shelter</td>
                </tr>
                <tr>
                    <td><input type="radio" name="service" value="Soup Kitchen" />Soup Kitchen</td>
                </tr>
                 <tr>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
       
    </form>
</body>
</html>