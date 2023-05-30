
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TP14 extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
    
    String nom = request.getParameter("nom");
    
PrintWriter out = response.getWriter();

    out.println("<html><body> Bonjour <strong><i>" + nom + "</strong></i> bienvenue avec nous ...</body></html>");

}
}
