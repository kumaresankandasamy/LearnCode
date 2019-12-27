<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<%
String user = request.getParameter("user");
%>
<body>

Hello, welcome <% out.println(user);%>

</body>
</html>
