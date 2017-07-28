<%@ page import="java.util.*" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
 
<html>
    <head>
    </head>
    <body>
        <table width="700px" align="center"
               style="border:1px solid #000000;">
            <tr>
                <td colspan=4 align="center"
                    style="background-color:teal">
                    <b>User Record</b></td>
            </tr>
            <tr style="background-color:lightgrey;">
                <td><b>Client Name </b></td>
                <td><b>Phone number</b></td>
                <td><b>Modify<b></td>
            </tr>
            <%
                int count = 0;
                String color = "#F9EBB3";
                if (request.getAttribute("piList") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("piList");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
 
                        if ((count % 2) == 0) {
                            color = "#eeffee";
                        }
                        count++;
                        ArrayList pList = (ArrayList) itr.next();
            %>
        
            <tr style="background-color:<%=color%>;">
                <td><%=pList.get(0)%></td>
                <td><%=pList.get(1)%></td>
                                 <input type="hidden" name="param1" value=pList.get(0)>
                                 <input type="hidden" name="param2" value=pList.get(1)>
                                  <!--<td><a href="${pageContext.request.contextPath}/Modifycl.jsp" onclick="<%=request.setAttribute("name", pList.get(0)) %>" >Update</a></td>-->
    			
              <td><a href="${pageContext.request.contextPath}/Modifycl.jsp?name=reena">Update</a></td>
                <!--<td><input type='button' name='edit' value='Edit' onclick='editRecord(${row.no})' /></td>-->
            </tr>
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td colspan=4 align="center"
                    style="background-color:#eeffee"><b>No Record Found..</b></td>
            </tr>
            <%            
            }
            %>
        </table>
    </body>
</html>