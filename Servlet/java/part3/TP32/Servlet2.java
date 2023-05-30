import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet{

public void doGet(HttpServletRequest request , HttpServletResponse response)

  throws ServletException, IOException {

         response.setContentType("text/html");


        String nom = request.getParameter("nom");
        HttpSession session = request.getSession(true);
        session.setAttribute("nom", nom);

         PrintWriter out = response.getWriter();
         
         out.println("<html>");
        out.println("<body>");
      
        out.println("<form action='"+response.encodeURL("S3")+"' method='GET'>"); 
        out.println("Age: <input type='text' name='age' >");
        out.println("Code Postal: <input type='text' name='code' >");
        out.println("<input type='submit' value='Envoyer vos information'> </form>\n<br>");
        
      
        
        
        out.println("</body>");
        out.println("</html>");
         
        
}



}
