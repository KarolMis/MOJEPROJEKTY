<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 10.06.2018
  Time: 09:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
    <h2>Hello in Admin Panel!</h2>
    <h3>Your IP address is: <%= request.getRemoteAddr() %></h3>
    <a href="LogoutServlet">Logout</a>
</body>
</html>
