<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--<title>Login Application</title>-->
<center><h1>Welcome to ASACS</h1> </center>
<br>
</head>
<body>

		<jsp:include page="header.jsp"></jsp:include>
     
     	
    <form action="loginServlet" method="post">
    
            <!--<legend> Login to Demo App </legend>-->
           
            <table align="center">
                <tr>
                    <td>User ID</td>
                    <td><input type="text" name="username" required="required" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="userpass" required="required" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                </tr>
            </table>
        <!--</fieldset>-->
    </form>
    
    
    
    
    
    	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>