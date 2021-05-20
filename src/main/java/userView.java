

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.LibroDAO;
import DB.LibroDAOimpl;
import Model.Libro;

/**
 * Servlet implementation class userView
 */
@WebServlet("/userView")
public class userView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibroDAO listaLibri = new LibroDAOimpl();
		try {
		List<Libro> listLibro = listaLibri.getAllLibro();
		request.setAttribute("libri", listLibro);
		

		  
		  RequestDispatcher requestDispatcher =
		  request.getRequestDispatcher("index2.jsp");
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
