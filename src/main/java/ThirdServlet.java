

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String userName = request.getParameter("username");
		String pwd = request.getParameter("password");
		String type = request.getParameter("type");

		if( (userName.equals("ciccio")) && (pwd.equals("1234")) && (type.equals("1")) ) {
			HttpSession oldSession = request.getSession(false);
			if(oldSession != null) {
				oldSession.invalidate();

			}
			HttpSession session = request.getSession();
			session.setAttribute("admin", type);
			response.sendRedirect("index1.jsp");
			
		}else if( (userName.equals("marco")) && (pwd.equals("1234")) && (type.equals("0")) ){
			HttpSession oldSession = request.getSession(false);
			if(oldSession != null) {
				oldSession.invalidate();
			}
			HttpSession session = request.getSession();
			session.setAttribute("user", type);
			response.sendRedirect("index2.jsp");
			
			
		}
		else {
			//JOptionPane.showMessageDialog(null, "sceeeeem");
			response.sendRedirect("login.jsp");


		}
	}

}
