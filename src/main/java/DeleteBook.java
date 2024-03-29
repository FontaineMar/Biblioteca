

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.RequestDispatcher;
import DB.LibroDAO;
import DB.LibroDAOimpl;
import Model.Libro;


/**
 * Servlet implementation class DeleteBook
 */
@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		LibroDAO bookDao = new LibroDAOimpl();

		Libro libro = new Libro();

		String idLibro = request.getParameter("idDelete");
		if(idLibro != null) {
			int id = Integer.parseInt(idLibro);
			libro.setId(id);
			try {
				bookDao.deleteLibro(libro);
				RequestDispatcher requestDispatcher =
						getServletContext().getRequestDispatcher("/off.jsp");
				requestDispatcher.forward(request, response);
			}catch(SQLException e) {
				e.printStackTrace();

			}
		}

	}
}