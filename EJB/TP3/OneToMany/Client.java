import javax.naming.*;
import mohammed.*;

public class Client {

	public static void main(String[] args) {
		try {

			InitialContext initcont = new InitialContext();
			IGestionLivre32 gestionLivre32 = (IGestionLivre32) initcont
					.lookup("java:global/hamid/GestionLivre32Imp");
			
			gestionLivre32.setAuteur("222",1);
			System.out.println("L'auteur du livre est : " + gestionLivre32.getAuteur("222"));
			
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
