<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
</head>
<body>
	<div class="page-container">
		<section>
			<div class="row">
				<div class="col col12">
					<div class="content">
						<form action="register" method="post">
							<input class="registerBtn" type="submit" value="Register" />
						</form>
						<form action="login" method="post">
							<input class="registerBtn" type="submit" value="Login" />
						</form>
						<form action="createStock" method="post">
							<input class="registerBtn" type="submit" value="Create Stock" />
						</form>
						<form action="viewStocks" method="post">
							<input class="registerBtn" type="submit" value="View Stocks" />
						</form>
					</div>
				</div>
			</div>
		</section>
	</div>

	
</body>
</html>