<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/users/submit" method="POST" modelAttribute="user">
		<label>Username</label>
		<input name="username" />
		</br></br>
		<label>Password</label>
		<input name="password" />
		</br></br>
		<label>Userfullname</label>
		<input name="userfullname" />
		</br></br>
		<button type="submit">Save</button>
	</form>
</body>
</html>