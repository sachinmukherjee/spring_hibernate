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
    <li class="breadcrumb-item active" aria-current="page">Add</li>
  </ol>
</nav>
	<div class="row">
	 <div class="col-md-12">
		<form action="${pageContext.request.contextPath}/owner_company/submit/" method="POST" modelAttribute="ownerCompany" class="form-control">
		    <form:label path="ownerCompany.name">Name</form:label>
		    <form:input path="ownerCompany.name"/>
			</br></br>
			<form:label path="ownerCompany.short_name">Short Name</form:label>
			<form:input path="ownerCompany.short_name"/>
			</br></br>
	  	<table class="table table-responsive">
	  	  <thead>
	  		<tr>
	  			<th>Name</th>
	  			<th>Location</th>
	  			<th>Action</th>
	  		</tr>
	  		</thead>
	  		<tbody>
	  		   <c:forEach items="${ownerCompany.ownerCompanyOffices}" varStatus="row">
	  		   		<tr class="toClone">
		  		 		<td><form:input path="ownerCompany.ownerCompanyOffices[${row.index}].name"/></td>
		  				<td><form:input path="ownerCompany.ownerCompanyOffices[${row.index}].location"/></td>
		  				<td class="remove"></td>
	  				</tr>
	  		   		
	  		   </c:forEach>
	  			<tr id="addRow">
	  				<td></td>
	  				<td></td>
	  				<td><a href="#" class="addMore">Add More</a>
	  			</tr>
	  		</tbody>
	  	</table>
	  	<button type="submit" class="btn btn-success">Save</button>
		</form>
	  </div>
	  	
	 </div>
</body>
</html>
<script type="text/javascript">
var counter = 1;
$(document).on("click",".addMore", function(){
	    var clonedRow = $(".toClone:first").clone();
	    $(clonedRow).find("input").each(function(){
	    	$(this).attr("name",$(this).attr("name").replace("[0]","["+counter+"]"));
	    	$(this).val("");
	    });
	    counter++;
	   	$(clonedRow).addClass("toRemove");
		$(clonedRow).find(".remove").addClass("removeRow");
		$(clonedRow).find(".remove").html("<a href='#'>Remove</a>");
		$(clonedRow).insertBefore($("#addRow"));
		
});

$(document).on("click",".removeRow", function(){
		$(this).closest("tr").remove();
});
</script>