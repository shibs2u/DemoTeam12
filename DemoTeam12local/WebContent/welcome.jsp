<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome <%=session.getAttribute("name")%></title>
</head>
<body>
 <form action="WelcomeServlet" method="post" > 
    <h3>Login successful!!!</h3>
    <h4>
        Hello,
        <%=session.getAttribute("name")%></h4>
         
            <input type="submit" id="btn1" name="kb" value="Create Client" action="openPage('createclient.jsp')"/>
            
            <input type="submit" id="btn2" name="kb" value="Update Client" action="openPage('modifyclient.jsp')"/>
            
            <input type="submit" id="btn3" name="kb" value="Client Request" action="openPage('clientrequest.jsp')"/>
            
            <input type="submit" id="btn4" name="kb" value="Site Maintenance" action="openPage('sitemaintenance.jsp')"/>
       </form>  
     </body>
</html>