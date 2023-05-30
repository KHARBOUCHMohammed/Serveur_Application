import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;


public class Servlet2 extends HttpServlet{

public void doGet(HttpServletRequest request , HttpServletResponse response)

	throws ServletException, IOException {

         response.setContentType("text/html");

         PrintWriter out = response.getWriter();
         HttpSession session = request.getSession(true);
      

        String nom = request.getParameter("nom");
       // HttpSession session = request.getSession(true);
        session.setAttribute("nom", nom);
        /*if(session.getAttribute("nom"))
        {

        }*/
        out.println("<html> <body> ");
   
      //  out.println(" Votre Nom: " +session.getAttribute("nom"));
        out.println("<form action='S3' method='GET'>"); 
        out.println("Age: <input type='text' name='age' >");
        out.println("Code Postal: <input type='text' name='code' >");
        out.println("<input type='submit' value='Envoyer vos information'> </form>\n<br>");
        
         out.println("<LI> Session ID: " + session.getId());
        out.println("</body> </html>");
      
         
        
}


public void doPost(HttpServletRequest request , HttpServletResponse response)

	throws ServletException, IOException {

         response.setContentType("text/html");

         PrintWriter out = response.getWriter();
         HttpSession session = request.getSession(true);


        String nom = request.getParameter("nom");
       
        session.setAttribute("nom", nom);
      
        out.println("<html><body>");
        

      //  session.getAttributes
       // out.println(" Votre Nom: " + session.getAttribute("nom"));

        out.println("Session ID: " + session.getId());
        out.println("<form action='S3' method='GET'>"); 
        out.println("Age: <input type='text' name='age' >");
        out.println("Code Postal: <input type='text' name='code' >");
        out.println("<input type='submit' value='Envoyer vos information'> </form>\n<br>");
        
        
        out.println("</body>");
        out.println("</html>");
}
}