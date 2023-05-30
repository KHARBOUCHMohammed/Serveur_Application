import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet1 extends HttpServlet{

	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<form action='S2' method='GET'>"); 
        out.println("Nom: <input type='text' name='nom' >");
        out.println("<input type='submit' value='Connexion...'>  </form>\n<br>");
        out.println("</body></html>");

        HttpSession session = request.getSession();
		session.invalidate();

    }
             
}

