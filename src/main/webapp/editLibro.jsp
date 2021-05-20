<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<form action="EditBook" method="post">
					<h1>Aggiorna Libro</h1>
					<div class="mb-3">
					<input type="hidden" class="form-control"
							id="exampleFormControlInput1" name="idEdit"  value="<%=request.getAttribute("idEdit")%>">
						<label for="exampleFormControlInput1" class="form-label">Titolo</label>
						<input type="text" class="form-control"
							id="exampleFormControlInput1" name="titleEdit" value="<%=request.getAttribute("titleLibro")%>">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Autore</label>
						<input type="text" class="form-control"
							id="exampleFormControlInput1" name="authorEdit"  value="<%=request.getAttribute("authorLibro")%>">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Genere</label>
						<select id="exampleFormControlInput1" name="genreEdit"  value="<%=request.getAttribute("genreLibro")%>">
							<option>Thriller</option>
							<option>Romantico</option>
							<option>Avventura</option>
							<option>Horror</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Isbn</label>
						<input type="text" class="form-control" name="isbnEdit"
							id="exampleFormControlInput1"  value="<%=request.getAttribute("isbnLibro")%>">
					</div>

					<div class="mb-3">
						<button type="submit" class="btn btn-primary btn-md" name="azione">Aggiorna libro</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>