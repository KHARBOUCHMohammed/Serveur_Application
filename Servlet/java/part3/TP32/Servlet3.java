import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;

public class Servlet3 extends HttpServlet {		


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		


				if(request.getSession(false)==null){ response.sendRedirect("S1");}
				
				else{


 				response.setContentType("text/html");


				PrintWriter out = response.getWriter();	

				 // lister les sessions
			    out.println(" Recaputilatif :"); 
			    String age = request.getParameter("age");
			    String code = request.getParameter("code");
				HttpSession session = request.getSession(true);
				session.setAttribute("age", age);
				session.setAttribute("code", code);
				//out.println(" Votre Nom: "+session.getAttribute("nom"));
				out.println("<LI> Votre Age: "+session.getAttribute("age"));
				out.println("<LI> Votre Code: "+session.getAttribute("code"));
				out.println("<LI> Session ID: " + session.getId());
				
				out.println("<br><a href="+response.encodeURL("S2")+"> Modifer vos information  </a>\n<br>");
				out.println("<br><a href="+response.encodeURL("S1")+"> Deconnexion .....</a>");


				}
			   

	}	




} 
