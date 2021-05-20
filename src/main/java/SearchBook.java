
import DB.LibroDAO;
import DB.LibroDAOimpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.Libro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.LibroDAOimpl;

/**
 * Servlet implementation class SearchBook
 */
@WebServlet("/SearchBook")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String searchType = request.getParameter("searchFor");


		if(searchType.equals("0")) {
			LibroDAO libroDao = new LibroDAOimpl();
			try {
				String titleSearch = request.getParameter("searchBar");
				List<Libro> getLibro = libroDao.getLibroTitle(titleSearch);
				request.setAttribute("libri", getLibro);

				RequestDispatcher requestDispatcher =
						request.getRequestDispatcher("index1.jsp");
				requestDispatcher.forward(request, response);


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		

		else if(searchType.equals("1")) {
			LibroDAO libroDao = new LibroDAOimpl();
			try {
				String genreSearch = request.getParameter("searchBar");
				List<Libro> getLibro = libroDao. getAllGenre(genreSearch);
				request.setAttribute("libri", getLibro);

				RequestDispatcher requestDispatcher =
						request.getRequestDispatcher("index1.jsp");
				requestDispatcher.forward(request, response);


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(searchType.equals("2")) {
			LibroDAO libroDao = new LibroDAOimpl();
			try {
				String isbnSearch = request.getParameter("searchBar");
				List<Libro> getLibro = libroDao. getLibroByIsbn(isbnSearch);
				request.setAttribute("libri", getLibro);

				RequestDispatcher requestDispatcher =
						request.getRequestDispatcher("index1.jsp");
				requestDispatcher.forward(request, response);


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(searchType.equals("3")) {
			LibroDAO libroDao = new LibroDAOimpl();
			try {
				String authorSearch = request.getParameter("searchBar");
				List<Libro> getLibro = libroDao. getLibroAuthor(authorSearch);
				request.setAttribute("libri", getLibro);

				RequestDispatcher requestDispatcher =
						request.getRequestDispatcher("index1.jsp");
				requestDispatcher.forward(request, response);


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}





	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
