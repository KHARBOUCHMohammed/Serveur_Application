import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
public class Servlet4 implements Filter {
     private FilterConfig filterConfig; 
     public void init(FilterConfig config) throws ServletException { 
        filterConfig = config; 
     }
         public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException { 
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response; 
            HttpSession session = req.getSession(false);
           
             if (session == null || session.getAttribute("nom") == null) { 
                
                res.sendRedirect(req.getContextPath() + "/S1");
                 return;
             } 
             
             
            chain.doFilter(request, response); 
        } 
        public void destroy() { 
            filterConfig = null; 
        } 
}