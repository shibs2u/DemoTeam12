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
    <form action="Createclientservlet" method="post">
        <!--<fieldset style="width: 300px">-->
        
          <legend align="center"> Create New Client </legend>
           
            <table align="center">
                <tr>
                    <td>Client Name</td>
                    <td><input type="text" name="usernme" required="required" /></td>
                </tr>
                <tr>
                    <td>Client Phone #</td>
                    <td><input type="text" name="userphone" required="required" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Create Client" /></td>
                </tr>
            </table>
        <!--</fieldset>-->
    </form>
</body>
</html>