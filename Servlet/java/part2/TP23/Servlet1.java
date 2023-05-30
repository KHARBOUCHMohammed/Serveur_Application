import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		       	throws ServletException, IOException {
		       	res.setContentType("text/html");
		       	PrintWriter out = res.getWriter();
		       	
		       
		        	if(req.getCookies()!= null) {
		       		
		       		out.println("Cookie : " +getCookieValue(req.getCookies(), "nom"));
		       	}

out.println("<html><body> <form method='POST' action='S2'> <input name='nom' placeholder='merci de saisir votre nom ' /> <button type='submit'> sign in </button> </form></body></html>");
		    

		       	
		       	
		       	}
		       	

		public static String getCookieValue(Cookie [] cookies,String cookieName){
				for(int x=0; x < cookies.length; x++) {
					Cookie cookie = cookies[x];
					if(cookieName.equals(cookie.getName())) return(cookie.getValue());
				}
				return("Cookie Not found.");
	}

	
	


	
}
