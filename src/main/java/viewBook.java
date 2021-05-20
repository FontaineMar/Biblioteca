

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewBook
 */
@WebServlet("/viewBook")
public class viewBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public viewBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idLibro = request.getParameter("idEdit");
		String titleLibro = request.getParameter("title");
		String authorLibro = request.getParameter("author");
		String isbnLibro = request.getParameter("isbn");
		String genreLibro = request.getParameter("genre");

		request.setAttribute("idEdit", idLibro);
		request.setAttribute("titleLibro", titleLibro);
		request.setAttribute("authorLibro", authorLibro);
		request.setAttribute("isbnLibro", isbnLibro);
		request.setAttribute("genreLibro", genreLibro);
		
		 RequestDispatcher requestDispatcher =
				  request.getRequestDispatcher("editLibro.jsp");
				  requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
