package mohammed;

import javax.ejb.Remote;

@Remote
public interface GestionEmprunts {
    void initSession(int numEmp);
    void emprunter(String isbn);
    void rendre(String isbn) ;
}