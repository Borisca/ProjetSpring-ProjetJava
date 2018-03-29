<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" ref="stylesheet"
	href="${pageContent.request.contextPath}/Resources/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CustomerList</title>
</head>
<body>
	<a href="list">retour</a>

	<table>
		<c:forEach items="${listCity}" var="item">
			<tr>
				<td>${id}</td>
				<td>${name}</td>
				<td>${countryCode}</td>
				<td>${district}</td>
				<td>${population}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>