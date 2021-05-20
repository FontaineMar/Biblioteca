<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Model.Utente"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-6">
				<form action="ThirdServlet" method="post">
					<h1>Ciao benvenuto registrati</h1>
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
					<div class="mb-3 justify-content-center">
						<button type="submit" class="btn btn-primary btn-md" name="azione">Registrati</button>
					</div>
					<!-- <div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Email
						address</label> <input type="email" class="form-control"
						id="exampleFormControlInput1" placeholder="name@example.com"
						name="posta">
				</div> -->
				</form>
			</div>
		</div>
	</div>
</body>
</html>