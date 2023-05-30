package mohammed;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.PersistenceContextType;

import mohammed.Emprunteur;

@Stateful
public class GestionEmpruntsBean implements GestionEmprunts {
    @PersistenceContext(unitName="PersitenceUnit",type=PersistenceContextType.EXTENDED)
    private EntityManager em;
    private Emprunteur emprunteur;

    public void initSession(int numEmp) {
        emprunteur = em.find(Emprunteur.class, numEmp);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void emprunter(String isbn) {
        LivreEmp livre = em.find(LivreEmp.class, isbn);
        livre.setEmpruntePar(emprunteur);
        emprunteur.emprunter();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void rendre(String isbn) {
        LivreEmp livre = em.find(LivreEmp.class, isbn);
        livre.setEmpruntePar(null);
        emprunteur.desemprunter();
    }
}