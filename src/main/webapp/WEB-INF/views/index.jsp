<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<table class="table table-bordered" id="tblCustomer">
			<tr>
				<th>Like</th>
				<th>ID</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${customers}" var="cus">
				<tr class="trid">
					<td id="${cus.id}"></td>
					<td><c:out value="${cus.id}"></c:out></td>
					<td><c:out value="${cus.name}"></c:out></td>
				</tr>
			</c:forEach>

		</table>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			var ids = ("${ids}").split(',');
			for ( var id in ids) {
				$('#'+ids[id]).html('<h1>hoho</h1>');
			}
		})
	</script>

</body>
</html>