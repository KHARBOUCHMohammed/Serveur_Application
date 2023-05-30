import javax.naming.*;
import mohammed.*;

public class Client {

	public static void main(String[] args) {
		try {

			InitialContext initcont = new InitialContext();
			IGestionLivre32 gestionLivre32 = (IGestionLivre32) initcont
					.lookup("java:global/hamid/GestionLivre32Imp");
			
	
			
			System.out.println("les livre de l'auteur "+ gestionLivre32.getAuteur("89")+" : "+gestionLivre32.getLivresAuteur("89"));

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
