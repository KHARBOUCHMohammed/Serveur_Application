import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TP17 extends HttpServlet {
public void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
    
    
   ServletConfig appConfig = getServletConfig();
   ServletContext appContext = getServletContext();
   String Prenom = request.getParameter("prenom");
   String  Nom = request.getParameter("nom");
   
 
   PrintWriter out = response.getWriter();
   
   if(Prenom.isEmpty() ){
      
      
        out.println("<html><body><LI>Bonjour <strong>" + appConfig.getInitParameter("prenom") + " </strong>vous n'avez pas saisi votre prenom </html></body>");
   }
   else {
    
        out.println("<html><body><LI>Bonjour votre prenom <strong>" + Prenom + " </strong> bienvenue avec nous ..... </html></body>");
}

  if( Nom.isEmpty()  ){
      
      
        out.println("<html><body><LI>Bonjour <strong>"  + appConfig.getInitParameter("nom") + " </strong>vous n'avez pas saisi votre nom </html></body>");
   }
   else {
    
        out.println("<html><body><LI>Bonjour votre Nom : <strong>"  + Nom + " </strong>bienvenue avec nous ..... </html></body>");
}
}
}
