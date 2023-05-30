import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.util.*;

public class TP16 extends HttpServlet {
  public void doPost(HttpServletRequest request,
					HttpServletResponse response)
	  throws ServletException, IOException {
	response.setContentType("text/html");

	PrintWriter out = response.getWriter();

	

	out.println("<HTML>\n<BODY>\n" +
				"<H1>Recapitulatif des informations</H1>\n" +
				"<UL>\n" +			   
		"  <LI>Nom: "+ request.getParameter("nom") + "\n" +
				"  <LI>Prenom: " + request.getParameter("prenom") + "\n" +
				" <LI>Nom de la Servlet " + getServletName() +"\n" +


		"</BODY></HTML>"); 






/*
	out.println("<HTML>\n<BODY>\n" +
				"<H1>Recapitulatif des informations</H1>\n" +
				"<UL>\n" +			   
		"  <LI>Nom: "
				+ request.getParameter("fname") + "\n" +
				"  <LI>Prenom: "
				+ request.getParameter("lname") + "\n" +	

                "<LI>Nom Servlet:"  
                
                + getServletName() +
		"</BODY></HTML>");  */
  }
}