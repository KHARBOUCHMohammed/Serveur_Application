
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mohammed.ISalut;


public class Client {	


    public static void main(String args[]){

           String name = "Mohammed";

           Context context;

	        try {
	            context = new InitialContext();
	          ISalut proxyLocal = (ISalut)context.lookup("mohammed.ISalut");
	            System.out.println(proxyLocal.salut(name));
	        } catch (NamingException e) {
	            e.printStackTrace();    
	        }
    }
    

}