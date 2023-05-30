import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TP12 extends GenericServlet {
public void service(ServletRequest request, ServletResponse res)
throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();


	out.println("<html><body> Welcome to my first servlet page created by Mohammed Kharbouch <a href= '/TP12/Question12'> Cliquez sur ce lien .... </a> </body></html>");
}
}


