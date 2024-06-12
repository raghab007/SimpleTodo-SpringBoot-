<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"> 

</head>
<body>
	<div class="container">
		<h1>To do list</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done ?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="todo" items="${todolist}">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href= "deleteTodo?id=${todo.id}" class="btn btn-danger">Delete </a></td>
					<td><a href= "updateTodo?id=${todo.id}" class="btn btn-info">Update </a></td>
					
	
				</tr>	
			</c:forEach>
			</tbody>
		</table>
		<a href="addTodo"  class="btn btn-success">Add todo</a>
	</div>
	
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js" type="text/javascript"></script>
</body>
</html>