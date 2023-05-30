import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;

public class Servlet4 extends HttpServlet {		


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	

			    response.setContentType("text/html");









        //session.setAttribute("fname", fname);


				PrintWriter out = response.getWriter();	

				HttpSession session = request.getSession();

			
				session.invalidate();

	}	

} 