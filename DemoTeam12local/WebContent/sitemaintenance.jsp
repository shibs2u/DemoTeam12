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



    <form action="SiteMaintenanceServlet" border="1" method="post" >
        <!--<fieldset style="width: 300px">-->
        
        
            <h2><center><legend> Site Details-Please select your current assigned Sites </legend></center></h2>
       
    		<table align ="center" width="700px"
               style="border:1px solid #000000;">
        		<c:forEach items="${list}" var="record">
          	  <tr>
          
                <td>${record.siteID}</td>
                <td>${record.name }</td>
                <td>${record.phone_number }</td>
                 <td>${record.street_address }</td>
                <td>${record.city }</td>
                <td>${record.state }</td>
                <td>${record.zipcode }</td>
                <td>
                <div class="checkbox">  
                <input type="hidden" name="check[]" value="record">    
                <label><INPUT TYPE="checkbox" name="check[]"/>Check</label>
                </div>
                </td>
                
            	</tr>
           
        		</c:forEach>
        		<tr></tr>
        		<tr></tr>
        		<tr></tr>
        		<tr></tr>
        		
        	     <tr>
        	    <td></td>
        	   	<td>
        	    	 <input type="submit" id="btn3" name="kb" value="Submit Selection" />
                </td>
                </tr>
    		</table>
   
    </form>

</body>
</html>