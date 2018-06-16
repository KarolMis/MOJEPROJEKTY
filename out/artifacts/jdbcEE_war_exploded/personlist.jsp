<%@ page import="java.util.List, pojo.Person" %><%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 11.06.2018
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>persons</title>
</head>
<body>
<h2>Lista osób:</h2>
<table style="width:50%" border="1">
    <tr>
        <th>Imię</th>
        <th>Nazwisko</th>
    </tr>
    <%
        List<Person> personList = (List<Person>)request.getAttribute("personList");
        if(personList != null)
            for(Person person: personList) {
    %>
    <tr>
        <td><%= person.getName() %></td>
        <td><%= person.getSurname() %></td>
    </tr>
    <%
            }
    %>
</table>
</body>
</html>
