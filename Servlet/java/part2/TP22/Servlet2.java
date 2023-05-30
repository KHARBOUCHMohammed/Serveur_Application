
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet2 extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException {
				
		ServletContext appContext = getServletContext();
		ServletConfig appConfig = getServletConfig();
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String nom = req.getParameter("nom");
		
        if(nom.isEmpty()){
	   	nom = "Med";
		  

		out.println("<html><body><h4>Bienvenue : "+ nom +"</h4><a href='S1'> Retour au formulaire  </a> <a href='e-mc137-101:8080/TP22/S2'>  Reafficher</a> </body> </html>");

        }else
          {
		out.println("<html><body><h4>Bienvenue : "+ req.getParameter("nom") +"</h4> <a href='S1'> Retour au formulaire  </a> <a href='e-mc137-101:8080/TP22/S2'>  Reafficher</a> </body> </html>");
	
   				}
	}
	

}
