import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException {
		ServletContext appContext = getServletContext();
		PrintWriter out = res.getWriter();
		
		String Prenom = (String) appContext.getAttribute("app-user");
		out.println("nom-utilisateur : "+ Prenom);
	}
}
