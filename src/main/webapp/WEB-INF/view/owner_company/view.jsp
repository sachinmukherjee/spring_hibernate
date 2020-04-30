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
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/owner_company/">Owner Company</a></li>
    <li class="breadcrumb-item active" aria-current="page">View</li>
  </ol>
</nav>
	<div class="row">
	 <div class="col-md-12">
		<table class="table table-hover">
			<thead>
				<tr>
					<th colspan="2" style="text-align: center;">Owner Company</th>
				</tr>
				<tr>
					<th>Name</th>
					<th>Short Name</th>
				</tr>
				<tr>
					<td>${ownerCompany.name}</td>
					<td>${ownerCompany.short_name}</td>
				</tr>
				<tr>
					<td style="text-align: center;" colspan="2"><b>Owner Company Offices</b></td>	
				</tr>
				<tr>
					<td><b>Name</b></td>
					<td><b>Location</b></td>
				</tr>
				<c:forEach items="${ownerCompany.ownerCompanyOffices}" var="ownerCompanyOffices">
					<tr>
						 <td>${ownerCompanyOffices.name}</td>
						 <td>${ownerCompanyOffices.location}</td>
					</tr>
				</c:forEach>
			</thead>
		</table>
	  </div>
	  	
	 </div>
</body>
</html>
