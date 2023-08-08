<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.diigitTraining.aadharInfo.addharInfo"%>

<%@page import="java.util.Iterator"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transaction History</title>
<link rel="stylesheet" type="text/css" href="sty.css">
</head>
<body>

	<h1>All Persons</h1>
	<%
	session = request.getSession();
	ArrayList id = (ArrayList) session.getAttribute("list");
	Iterator it = id.iterator();
	while (it.hasNext()) {
		addharInfo a = (addharInfo) it.next();
		out.println("id " + a.getId()+ "<br>");
		out.println ("name " + a.getName()+ "<br>");
		out.println ("email " + a.getEmail()+ "<br>");
		out.println ("gender " + a.getGender()+ "<br>");
		out.println ("address " + a.getAddress()+ "<br>");
		out.println ("pin " + a.getPin()+ "<br>");
		out.println ("phonenumber " + a.getPhonenumber()+ "<br>");
		

	}
	%>



</body>
</html>
