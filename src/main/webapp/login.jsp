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
			<!-- 			<a href="registrati.jsp" class="btn btn-primary stretched-link">Registrati</a>
 -->
		</div>
		<div class="row justify-content-center">
			<div class="col-6">
				<form action="ThirdServlet" method="post">
					<h1>Ciao accedi alla piattaforma</h1>
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
					<div>
						<input type="radio" id="contactChoice1" name="type" value="0"
							checked> <label for="contactChoice1">Utente</label> <input
							type="radio" id="contactChoice2" name="type" value="1"> <label
							for="contactChoice2">Amministratore</label>
					</div>
					<div class="mb-3">
						<button type="submit" class="btn btn-primary btn-md" name="azione">Accedi</button>
					</div>
				</form>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-6">

				<h6>
					Non sei registrato? <a href="registrati.jsp"
						class="btn btn-primary stretched-link">Registrati</a>
				</h6>
			</div>

		</div>
	</div>
</body>
</html>