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
		<% 
		    String id = request.getParameter("id");  
			String phone = request.getParameter("phone"); 
			String name = request.getParameter("name"); 
			System.out.println(id + "" + phone + "" + name); 
		%>
	
    <form action="getclientservlet" method="post">
        <!--<fieldset style="width: 300px">-->
        
            <legend> Modify Client Information </legend>
            
   		<c:out value=phone></c:out>
   		<c:out value=name></c:out>
   				
            <table align="center">
                <tr>
                    <td>Client Name</td>
                    <td><input type="text" name="clientname" required="required" value=<%=name%>></td>
                </tr>
                <tr>
                    <td>Client Phone #</td>
                    <td><input type="text" name="phone" required="required" value=<%=phone%>></td>
                </tr>
                
                   <tr>
                        <td><input type="hidden" name="id"  value=<%=id%>></td>
                </tr>
                 <tr>
                    <td><input type="submit" value="Update" /></td>
                </tr>
            </table>
        <!--</fieldset>-->
    </form>
</body>
</html>