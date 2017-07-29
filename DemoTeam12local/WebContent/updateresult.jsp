<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--<title>Welcome <%=session.getAttribute("name")%></title>-->
</head>
<body>
 <form action="UpdateResultservlet" method="post" > 
    
    <h3>Client, <%=session.getAttribute("name")%> has been updated successfully</h3>
    
            <input type="submit" id="btn1" name="kb" value="Update More Clients" action="openPage('Modifyindex.jsp')"/>
            <input type="submit" id="btn2" name="kb" value="Main Menu" action="openPage('welcome.jsp')"/>
          
       </form>  
     </body>
</html>