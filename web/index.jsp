<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 10:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <%
    ArrayList<entity.Employee> employeeArrayList = (ArrayList<Employee>) request.getAttribute("list-emm");
    if (employeeArrayList == null || employeeArrayList.size() == 0){
      employeeArrayList = new ArrayList<>();
    }
  %>
  <body>
  <div>
    <table>
      <tr>
        <td>
          FullName
        </td>
        <td>
          DOB
        </td>
        <td>
          Address
        </td>
        <td>
          Position
        </td>
        <td>
          Department
        </td>
      </tr>
      <%
        for (Employee e:
             employeeArrayList) {
          %>
      <tr>
        <td>
          <%=e.getFullname()%>
        </td>
        <td>
          <%=e.getDob()%>
        </td>
        <td>
          <%=e.getAddress()%>
        </td>
        <td>
          <%=e.getPosition()%>
        </td>
        <td>
          <%=e.getDepartment()%>
        </td>
      </tr>
      <%
        }
      %>
    </table>
  </div>
  </body>
</html>
