<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 18.06.2018
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Tajna baza FBI</title>
</head>
<body>
<h1>Zaloguj się</h1>
<form action="InputServlet" method="post">
  <input type="text" placeHolder="Username" name="username">
  <br>
  <input type="password" placeHolder="Password" name="password">
  <br>
  <input type="submit" value="Zaloguj">
</form>
</body>
</html>
