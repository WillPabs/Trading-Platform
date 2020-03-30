<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create A Stock</title>
</head>
<body>
	<div class="page-container">
		<section>
			<div class="row">
				<div class="col col12">
					<div class="content">
						<sf:form action="registerStock" modelAttribute="stock">
							<table>
								<tr>
									<td>Ticker</td>
									<td><sf:input path="ticker" required="required"/></td>
								</tr>
								<tr>
									<td>Price</td>
									<td><sf:input path="price" required="required"/></td>
								</tr>
								<tr>
									<td>
										<input class="registerBtn" type="submit" value="Create Stock" />
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