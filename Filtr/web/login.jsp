<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 10.06.2018
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Zaloguj się</h2>
    <form action="LoginServlet" method="post">
        Username: <input type="text" name="username">
        <br>
        Password: <input type="password" name="password">
        <br>
        <input type="submit" value="Zaloguj">
    </form>
</body>
</html>
