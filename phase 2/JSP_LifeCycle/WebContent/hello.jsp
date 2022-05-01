<%@ page import="java.util.*, java.time.*"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hi friends!
<h1>Welcome to JSP page</h1>

	<%   int x = 100;
	 
	 out.print(x); 
	 
	 //This is a scriplet where java code can be written
	 Date date = new Date();
	 
	 out.print(LocalDate.now());
	 
	// out.print("<h1>"+date+"<h1>");
	 
	 %>
	 
	 <h1>Date is : <% out.print(date); %></h1>
	 
	 
</body>
</html>