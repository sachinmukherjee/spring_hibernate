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
<body class="bg-light">
<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/users/">Users</a></li>
    <li class="breadcrumb-item active" aria-current="page">Add</li>
  </ol>
</nav>
<div class="container">
	<div class="py-5  mx-auto">
		<i class="d-block mx-auto mb-4"></i>
		<h2>User Form</h2>
		<p class="lead">
			Fill Details to Create a User
		</p>
	</div>
	<div class="row">
		<div class="col-md-8">
			<form:form action="${pageContext.request.contextPath}/users/submit" method="POST" modelAttribute="user">
				<div class="row">
					<div class="col-md-6 mb-3">
						<form:label path="username">Username</form:label>
						<form:input path="username" cssClass="form-control"/>
					</div>
					<div class="col-md-6 mb-3">
						<form:label path="userfullname">Userfullname</form:label>
						<form:input path="userfullname" cssClass="form-control"/>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 mb-3">
						<form:label path="password">Password</form:label>
						<form:input path="password" cssClass="form-control"/>
					</div>
					<div class="col-md-6 mb-3">
						<form:label path="password">Re enter Password</form:label>
						<form:input path="password" cssClass="form-control"/>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 mb-3">
						<form:label path="owner_company.id">Owner Company</form:label>
						<form:select path="owner_company.id" cssClass="form-control ownerCompany" required="required">
							<form:option selected="true" value="${ownerCompanies.get(0)}">Select</form:option>
							<c:forEach items="${ownerCompanies}" var="ownerCompany">
								<form:option value="${ownerCompany.id}">${ownerCompany.name}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="col-md-6 mb-3">
						<form:label path="ownerCompanyOffices.id">Owner Company Office</form:label>
						<form:select path="ownerCompanyOffices.id" cssClass="form-control ownerCompanyOffice" required="required">
							
						</form:select>
					</div>
				</div>
			
			</form:form>
			
		</div>
	</div>
</div>
 </body>
</html>
<style type="text/css">
	.show{
		font-size: 12px;
	}
</style>
<script>
	$(".show").on("click", function(){
		var input = $(".password");
		var type = $(input).attr("type");
		if(type == "password"){
			$(input).attr("type","text");
		}else{
			$(input).attr("type","password");
		}
	});
</script>