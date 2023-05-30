
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
	   
		  
          deleteCookie(req,res);

		nom = "Med";
    out.println("<html><body><h4>Bienvenue : "+ nom +"</h4><LI> <a href='S3'>  Nom Cookie </a>  <LI> <a href='S1'> Retour au formulaire  </a> <LI><a href='e-mc137-101:8080/T23/S2'>  Reafficher</a> </body> </html>");


        }else
          {
			Cookie unCookie = new Cookie("nom", nom);
			res.addCookie(unCookie);
		

out.println("<html><body><h4>Bienvenue : "+ req.getParameter("nom") +"</h4><LI> <a href='S3'>  Nom Cookie </a> <LI><a href='S1'> Retour au formulaire  </a><br> <LI><a href='e-mc137-101:8080/T23/S2'>  Reafficher</a> <br></body> </html>");
		
		
		}

			}
	
		public static void deleteCookie(HttpServletRequest req, HttpServletResponse res){
		
		for (int i = 0; i < req.getCookies().length; i++) {
               
               Cookie cookie = req.getCookies()[i];
               cookie.setMaxAge(0);
               res.addCookie(cookie);
               
      };
      
   }
		
		
		
		
	}
	

