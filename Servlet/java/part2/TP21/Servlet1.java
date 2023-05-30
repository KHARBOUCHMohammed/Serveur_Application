import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		       	throws ServletException, IOException {
		       	res.setContentType("text/html");
		       	PrintWriter out = res.getWriter();
		       	
		       
		       


		       	out.println("<html><body> <form method='POST' action='S2'><input name='nom' placeholder='merci de saisir votre nom ' /> <button type='submit'> sign in </button> </form></body></html>");
		   
		       	
		       	}
		       	

	
	


	
}
