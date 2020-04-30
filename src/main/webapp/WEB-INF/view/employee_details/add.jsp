<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE div PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>Add</title>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.0.3.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
 <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/employee_details/">Employee Details</a></li>
    <li class="breadcrumb-item active" aria-current="page">Add</li>
  </ol>
</nav>
	<form:form	method="POST" action="${pageContext.request.contextPath}/employee_details/submit" modelAttribute="employee" class="form-control">
		<form:label path="user.id">Username</form:label>
		<form:select path="user.id" required="required">
			<form:option value="${user.get(0)}">Select One</form:option>
			<c:forEach var="user" items="${userList}">
			   	<form:option value="${user.id}">${user.username}</form:option>
			</c:forEach>
		</form:select>
		</br></br>
		<form:label path="first_name">First Name</form:label>
		<form:input path="first_name"/>
		</br>
		</br>
		<form:label path="middle_name">Middle Name</form:label>
		<form:input path="middle_name"/>
		</br></br>
		<form:label path="last_name">Last Name</form:label>
		<form:input path="last_name"/>
		</br></br>
		<form:label path="email">Email</form:label>
		<form:input path="email"/>
		</br></br>
		<form:button class="btn btn-success">Save</form:button>
	</form:form>
	
</body>
</html>
