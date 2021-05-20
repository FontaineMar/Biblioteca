<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Model.Libro"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />

</head>
<body>
	<div class="container">
		<div class="row ">
			<div class="col-10 ">
				<h1>Lista dei libri</h1>
				<form action="SearchBook" method="get">
					<div class="input-group mb-3">
						<input type="text" class="form-control"
							placeholder="Ricerca libro" aria-label="Recipient's username"
							aria-describedby="button-addon2" name="searchBar">
						<button class="btn btn-outline-secondary" type="submit"
							id="button-addon2">
							<i class="fas fa-search"></i>
						</button>
					</div>
					<label for="exampleFormControlInput1" class="form-label">Ricerca
						per</label> <select class="form-select form-select-sm"
						id="exampleFormControlInput1" aria-label=".form-select-sm example"
						name="searchFor">
						<option value="0">Titolo</option>
						<option value="1">Genere</option>
						<option value="2">Isbn</option>
						<option value="3">Autore</option>
					</select>
				</form>
				<table class="table table-dark table-hover justify-content-center">
					<thead>
						<tr>
							<th scope="col">Isbn</th>
							<th scope="col">Titolo</th>
							<th scope="col">Autore</th>
							<th scope="col">Genere</th>
							<th scope="col">Modifica</th>
							<th scope="col">Cancella</th>

						</tr>
					</thead>
					<tbody>
						<%
						ArrayList listLibro = (ArrayList) request.getAttribute("libri");
						if (listLibro != null) {
							for (int i = 0; i < listLibro.size(); i++) {
								Libro libro = (Libro) listLibro.get(i);
						%>
						<tr>
							<td scope="row" name=""><%=libro.getIsbn()%></td>
							<td><%=libro.getTitle()%></td>
							<td><%=libro.getAuthor()%></td>
							<td><%=libro.getGenre()%></td>
							<td>
								<form action="viewBook" method="get">
									<input type="hidden" name="idEdit" value="<%=libro.getId()%>" />
									<input type="hidden" name="title" value="<%=libro.getTitle()%>" />
									<input type="hidden" name="author"
										value="<%=libro.getAuthor()%>" /> <input type="hidden"
										name="genre" value="<%=libro.getGenre()%>" /> <input
										type="hidden" name="isbn" value="<%=libro.getIsbn()%>" />
									<div class="col-2">
										<button type="submit" class="btn btn-primary stretched-link">Aggiorna</button>
									</div>
								</form>
							</td>
							<td>
								<form action="DeleteBook" method="post">
									<input type="hidden" name="idDelete" value="<%=libro.getId()%>" />
									<div class="col-2">
										<button type="submit" class="btn btn-danger stretched-link">X</button>
									</div>
								</form>
							</td>

							<%
							}

							} else {
							//pageContext.forward("SecondServlet");
							%>

							<jsp:forward page="SecondServlet" />
							<%
							}
							%>
						</tr>

					</tbody>
				</table>
			</div>
		</div>
		<div class="row ">
			<div class="col-10 ">
				<a href="inserisciLibro.jsp" class="btn btn-primary stretched-link">inserisci</a>
			</div>
		</div>
	</div>
</body>
</html>