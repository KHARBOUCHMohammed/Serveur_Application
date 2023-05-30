import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TP122 extends GenericServlet {
public void service(ServletRequest request, ServletResponse res)
throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();


	out.println("<html><body> Welcome to my Second servlet created by Mohammed Kharbouch ...... </body></html>");
}
}
