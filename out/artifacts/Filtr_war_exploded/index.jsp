<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 10.06.2018
  Time: 09:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello</title>
  </head>
  <body>
    <h2>Witaj, Twój adres IP: <%=request.getRemoteAddr()%></h2>
    <a href="admin.jsp">Admin Panel</a>
  </body>
</html>
