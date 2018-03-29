<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<h2>Ma liste de clients</h2>
<table>
	<thead>
		<tr>
			<th>id</th>
			<th>nom</th>
			<th>prénom</th>
			<th>email</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items ="${listCustomers}" var="item">
		<tr>
		<td>${item.id}</td>
		<td>${item.last_name}</td>
		<td>${item.first_name}</td>
		<td>${item.email}</td>
	
		</tr>
	</c:forEach>
	</tbody>
</table>

