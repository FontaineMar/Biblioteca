

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.DatabaseConnection;
import DB.LibroDAO;
import DB.LibroDAOimpl;
import Model.Libro;

/**
 * Servlet implementation class EditBook
 */
@WebServlet("/EditBook")
public class EditBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibroDAO bookDao = new LibroDAOimpl();

		Libro libro = new Libro();

		String idLibro = request.getParameter("idEdit");
		String titleLibro = request.getParameter("titleEdit");
		String authorLibro = request.getParameter("authorEdit");
		String isbnLibro = request.getParameter("isbnEdit");
		String genreLibro = request.getParameter("genreEdit");

		if((idLibro != null) && (titleLibro != null) && (authorLibro != null) && (genreLibro != null) && (isbnLibro != null)) {
			int id = Integer.parseInt(idLibro);
			libro.setId(id);
			libro.setTitle(titleLibro);
			libro.setAuthor(authorLibro);
			libro.setIsbn(isbnLibro);
			libro.setGenre(genreLibro);
			try {
				bookDao.updateLibro(libro);
				RequestDispatcher requestDispatcher =
						getServletContext().getRequestDispatcher("/okEdit.jsp");
				requestDispatcher.forward(request, response);
			}catch(SQLException e) {
				e.printStackTrace();

			}
		}
	}

}
