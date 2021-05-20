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
</head>
<body>
	<div class="container">

	<h1 class="col-10 ">Lista dei libri</h1>


		<table class="table table-dark table-hover justify-content-center">
					<thead>
						<tr>
							<th scope="col">Isbn</th>
							<th scope="col">Titolo</th>
							<th scope="col">Autore</th>
							<th scope="col">Genere</th>
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
							
							<%
							}

							} else {
							%>

							<jsp:forward page="userView" />
							<%
							}
							%>
						</tr>

					</tbody>
				</table>
	</div>
</body>
</html>