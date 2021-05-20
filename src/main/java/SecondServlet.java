
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
import javax.servlet.http.HttpSession;

import Model.Libro;



/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SecondServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String isAdmin = (String)session.getAttribute("admin");

		
		
		LibroDAO listaLibri = new LibroDAOimpl();
		try {
		List<Libro> listLibro = listaLibri.getAllLibro();
		request.setAttribute("libri", listLibro);
		

		  
		  RequestDispatcher requestDispatcher =
		  request.getRequestDispatcher("index1.jsp");
		  requestDispatcher.forward(request, response);
		

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
