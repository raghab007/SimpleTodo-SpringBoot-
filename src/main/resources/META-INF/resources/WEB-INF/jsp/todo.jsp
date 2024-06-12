<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"> 

</head>
<body>
	<div class="container">
	<h1>Enter Todo details</h1>
	<form:form action="addTodo" method="post" modelAttribute="todo">
		Description:<form:input type="text" path ="description"  required="required"/>
		<form:input type="hidden" path ="id"  />
		<form:input type="hidden" path ="done"  />
		<input class="btn btn-success" type="submit" value="Submit" />	
		<form:errors path="description" cssClass="text-warning"/>
		
	</form:form>
	</div>	
	
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js" type="text/javascript"></script>
</body>
</html>