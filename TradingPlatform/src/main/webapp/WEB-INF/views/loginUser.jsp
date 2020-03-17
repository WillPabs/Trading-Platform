<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>User Login</h1>
	<div class="page-container">
		<c:if test="${requestScope.errorCheck == 1}">
			<p>User does not exist!</p>
		</c:if>
		<c:if test="${requestScope.errorCheck == 2}">
			<p>Email or Password does not match!</p>
		</c:if>
		<sf:form action="processLogin" method="post">
			<table>
				<tr>
					<td>Email</td>
					<!-- change input so it's not using spring form  -->
					<td><input type="email" required/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><sf:input path="password" required="required"/></td>
				</tr>
				<tr>
					<td>
						<input class="loginBtn" type="submit" value="Login"/>
					</td>
				</tr>
			</table>
		</sf:form>
	</div>
	
</body>
</html>