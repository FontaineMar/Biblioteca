
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
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		LibroDAO listaLibri = new LibroDAOimpl();
		try {
		List<Libro> listLibro = listaLibri.getAllLibro();
		request.setAttribute("libri", listLibro);
		

		String destination = "index.jsp";
		  
		  RequestDispatcher requestDispatcher =
		  request.getRequestDispatcher(destination);
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		/*
		 * int id = 0;
		 * 
		 * String isbn = request.getParameter("isbn"); String titolo =
		 * request.getParameter("title"); String autore =
		 * request.getParameter("author"); String genere =
		 * request.getParameter("genre");
		 * 
		 * 
		 * String destination = "index.jsp";
		 * 
		 * RequestDispatcher requestDispatcher =
		 * request.getRequestDispatcher(destination);
		 * 
		 * 
		 * ArrayList v = new ArrayList(); Libro l = new
		 * Libro(id,isbn,titolo,autore,genere); v.add(l);
		 * 
		 * request.setAttribute("libri", v);
		 * 
		 * 
		 * requestDispatcher.forward(request, response);
		 */
		
		
	}

}
