import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet1 extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {


                 response.setContentType("text/html");

                 PrintWriter out =response.getWriter();
                 
                 String nom = request.getParameter("nom");
                 getServletContext().setAttribute("nom", nom);

                 out.println("<html><body><a href='S2'>  Cliquez  ...   </a></body></html>");

             }

}
