import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet{

public void doGet(HttpServletRequest request , HttpServletResponse response)

    throws ServletException, IOException {

         response.setContentType("text/html");

         PrintWriter out = response.getWriter();
         String nom = (String) getServletContext().getAttribute("nom");
         out.println("<html><body>Bonjour le nom Pardefaut :" + nom + "</body></html>");

    }
}
