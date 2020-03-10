<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<h1>Create Shareholder Account</h1>
	<div class="page-container">
		<section>
			<div class="row">
				<div class="col col12">
					<div class="content">
						<sf:form action="createUser" modelAttribute="shareholder">
							<table>
								<tr>
									<td>First Name</td>
									<td><sf:input path="firstName" required="required"/></td>
								</tr>
								<tr>
									<td>Last Name</td>
									<td><sf:input path="lastName" required="required"/></td>
								</tr>
								<tr>
									<td>Email</td>
									<td><sf:input path="email" required="required"/></td>
								</tr>
								<tr>
									<td>Password</td>
									<td><sf:password path="password" required="required"/></td>
								</tr>
								<tr>
									<td>Confirm Password</td>
									<td><sf:password path="confirmPassword" required="required"/></td>
								</tr>
								<tr>
									<td>SSN</td>
									<td><sf:input path="SSN" required="required"/></td>
								</tr>
								<tr>
									<td>
										<input class="registerBtn" type="submit" value="Create Account" />
									</td>
								</tr>
							</table>
						</sf:form>
					</div>
				</div>
			</div>
		</section>
	</div>
</body>
</html>