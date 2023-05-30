import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mohammed.ISaluer;

public class ClientSaluer {	


    public static void main(String args[]){

           String name = "Mohammed";

           Context context;

	        try {
	            context = new InitialContext();
	          ISaluer proxyLocal = (ISaluer)context.lookup("mohammed.ISaluer");
			  // Appel de la méthode salut
	            System.out.println(proxyLocal.salut(name));
				//Appel de la méthode re_salut
				System.out.println(proxyLocal.re_salut());
	        } catch (NamingException e) {
	            e.printStackTrace();    
	        }
    }
    

}


