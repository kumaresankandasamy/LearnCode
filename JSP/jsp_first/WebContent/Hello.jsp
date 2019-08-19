<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP page</title>
</head>
<%
int count = 0;
%>

<body>
<h1>welcome user</h1>
page count is <% out.println(++count);%>

</body>
</html>