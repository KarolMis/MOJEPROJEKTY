<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 18.06.2018
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Przegldarka miast</h1>
  <form action="ControllerServlet" method="post">
    <input type="text" placeholder="miasto" name="city">
    <br>
    <input type="text" placeholder="kod państwa" name="country">
    <br>
    <input type="text" placeholder="region" name="district">
    <br>
    <input type="number" placeholder="populacja" name="population">
    <br>
    Dodaj<input type="radio" name="option" value="add"> Usuń <input type="radio" name="option" value="delete">
    <br>
    <input type="submit" value="Wyślij">
  </form>
  </body>
</html>
