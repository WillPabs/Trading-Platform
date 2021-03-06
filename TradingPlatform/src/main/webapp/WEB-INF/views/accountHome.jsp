<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Home</title>
</head>
<body>
	<div class="page-container">
		<h2>Successfully Created Account</h2>
			<h4>Account Information:</h4>
			<table>
				<tr>
					<td>Name: ${shareholder.firstName} ${shareholder.lastName} </td>
				</tr>
				<tr>
					<td>Email: ${shareholder.email}</td>
				</tr>
				<tr>
					<td>Password: ${shareholder.password}</td>
				</tr>
				<tr>
					<td>SSN: ${shareholder.SSN}</td>
				</tr>
				<tr>
					<td>Balance: ${shareholder.balance}</td>
				</tr>
				<tr>
					<td>Trades: ${shareholder.trades}</td>
				</tr>
			</table>
	</div>
	
	

</body>
</html>