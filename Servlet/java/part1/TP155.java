import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.util.*;

public class TP155 extends HttpServlet {
  public void doPost(HttpServletRequest request,
					HttpServletResponse response)
	  throws ServletException, IOException {
	response.setContentType("text/html");

	PrintWriter out = response.getWriter();

	// out.println("<html><body>     <h2>HTML Forms</h2><form method='POST' action='Question55'>  <label for='fname'> Nom :</label><br> <input type='text' id='fname' name='fname' ><br> <label for='lname'> Prenom: </label><br> <input type='text' id='prenom' name='lname' ><br><br> <input type='submit' value='Submit'></form>             </body></html>");







	out.println("<HTML>\n<BODY>\n" +
				"<H1>Recapitulatif des informations</H1>\n" +
				"<UL>\n" +			   
		"  <LI>Nom: "
				+ request.getParameter("nom") + "\n" +
				"  <LI>Prenom: "
				+ request.getParameter("prenom") + "\n" +	
		"</BODY></HTML>");  
  }
}