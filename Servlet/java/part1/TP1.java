
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TP1 extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("Hello World ! Mohammed ");
}
}



