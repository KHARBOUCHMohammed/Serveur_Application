import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet3 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		       	throws ServletException, IOException {
		       	res.setContentType("text/html");
		       	PrintWriter out = res.getWriter();
		       	
		       	out.println("<html><body> <h4><LI> Cookie : "+getCookieValue(req.getCookies(), "nom" )+"</h4>   <LI> <a href='S1'>  retour au formulaire</a></from></body></html>");
		  
		       	
		       	
	}

	public static String getCookieValue(Cookie [] cookies,String cookieName){
				for(int x=0; x < cookies.length; x++) {
					Cookie cookie = cookies[x];
					if(cookieName.equals(cookie.getName())) return(cookie.getValue());
				}
				return("Cookie Not Found.");
	}
		       	

	
	

}	

