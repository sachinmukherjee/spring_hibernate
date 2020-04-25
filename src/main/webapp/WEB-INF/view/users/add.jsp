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
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/users/">Users</a></li>
    <li class="breadcrumb-item active" aria-current="page">Add</li>
  </ol>
</nav>
	<form action="${pageContext.request.contextPath}/users/submit" method="POST" modelAttribute="user" class="form-control">
		<label>Username</label>
		<input name="username" required="required"/>
		</br></br>
		<label>Password</label>
		<span>
			<input name="password" required="required" type="password" class="password"/><i class="show">&nbsp;Show</i>
		</span>
		</br></br>
		<label>Userfullname</label>
		<input name="userfullname" required="required"/>
		</br></br>
		<button type="submit" class="btn btn-success">Save</button>
	</form>
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