import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("Récapitualatif ");
		
		String Prenom = req.getParameter("fname");
		ServletConfig app = getServletConfig();
		out.println(Prenom+"\n"+app.getServletName());
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
		       	throws ServletException, IOException {

		ServletConfig appConfig = getServletConfig();
		ServletContext appContext = getServletContext();
		PrintWriter out = res.getWriter();

		
		String Prenom = req.getParameter("fname");
		
	   if(Prenom == "") {
	   	
	   	out.println("default "+appConfig.getInitParameter("fname"));
			Prenom = appContext.getInitParameter("fname");
			
	   } ;
		
		out.println("Bienvenue "+Prenom);

		appContext.setAttribute("nom-utilisateur :", Prenom);

		out.println("Nom Servlet:"+appConfig.getServletName());

	}

	
}
