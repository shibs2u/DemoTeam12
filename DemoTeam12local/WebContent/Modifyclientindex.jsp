<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
 
<html>
  <head>
  </head>
  <body>
    <br/><br/>
    <form method="post" action="Modifyclientservlet">
     
      <table border="0" width="300" align="center">
        <tr><td colspan=2 style="font-size:12pt;" align="center">
        <h3>Client Search</h3></td></tr>
        <tr><td ><b>Client</b></td>
          <td>
             <input  type="text" name="pid" id="pid">
        </td></tr>        
        <tr><td colspan=2 align="center">
        <input  type="submit" name="submit" value="Search"></td></tr>
        </table>
        
            </tr>
       			<jsp:include page="Modifyclientsearch.jsp" flush="true"/>
            </tr>
    </form>
  </body>
</html>