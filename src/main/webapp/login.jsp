<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Model.Utente"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<title>Insert title here</title>

</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<form class="col-6" action="FirstServlet" method="get">
				<h1>Login</h1>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Username</label>
					<input type="text" class="form-control"
						id="exampleFormControlInput1" name="username">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Password</label>
					<input type="password" class="form-control"
						id="exampleFormControlInput1" name="password">
				</div>
			</form>
		</div>
	</div>
</body>
</html>