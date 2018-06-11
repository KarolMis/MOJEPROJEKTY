<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 11.06.2018
  Time: 08:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AllCookies</title>
</head>
<body>
<%
    if(request.getCookies() != null)
        for(Cookie c: request.getCookies()) {
%>
<%= c.getName() + " > " + c.getValue() %>
<br>
<%
        }
%>
<a href="CookieServlet?cookie=print">Refresh page</a>
<br>
<a href="index.jsp">Homepage</a>
</body>
</html>
