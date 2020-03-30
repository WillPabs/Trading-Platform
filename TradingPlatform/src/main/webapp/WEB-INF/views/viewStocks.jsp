<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Stocks</title>
</head>
<body>
	<div class="page-container">
		<h2>Stocks</h2>
			<table>
				<c:forEach var="stock" items="${stocks}">
				<tr>
					<td>
						<c:out value="${stock.ticker}"></c:out>
						<c:out value="${stock.price}"></c:out>
					</td>
				</tr>
				</c:forEach>	
			</table>
	</div>
</body>
</html>