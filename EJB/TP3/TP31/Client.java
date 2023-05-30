import javax.naming.*;
import mohammed.*;

public class Client {

	public static void main(String[] args) {
		try {

			InitialContext initcont = new InitialContext();
			IGestionLivre31 gestionLivre31 = (IGestionLivre31) initcont
					.lookup("java:global/TP31/GestionLivre31Imp");

			System.out.println("Nb page est : " + gestionLivre31.getNbPages("111"));

		} catch (Exception e) {

			System.out.println(e);

		}
	}
}
