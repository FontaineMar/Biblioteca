
import DB.LibroDAO;
import DB.LibroDAOimpl;
import Model.Libro;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class InsertBook
 */
@WebServlet("/InsertBook")
public class InsertBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertBook() {
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
		// TODO Auto-generated method stub

		

		try {
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			String genre = request.getParameter("genre");
			String isbn = request.getParameter("isbn");
			if( (title == null) && (author == null) && (genre == null)  && (isbn == null) ) {
			 return;
			}
			
			LibroDAO libroDAO = new LibroDAOimpl();

			Libro libro = new Libro();
			libro.setTitle(title);
			libro.setAuthor(author);
			libro.setGenre(genre);
			libro.setIsbn(isbn);
			libroDAO.insertLibro(libro);
			 RequestDispatcher requestDispatcher =
					  request.getRequestDispatcher("index1.jsp");
					  requestDispatcher.forward(request, response);
		}
		catch(SQLException e) {
			e.printStackTrace();

		}

	}

}
