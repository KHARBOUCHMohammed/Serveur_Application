package mohammed;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Emprunteur implements Serializable {
    @Id
    public int numEmp;
    public String nom;
    public int nbLivresEmp;

    public void setNblivresemp(int nbLivresEmp) {
    this.nbLivresEmp = nbLivresEmp;
    }

    public int getNblivresemp() {
        return nbLivresEmp;
    }

    public void emprunter() {
        nbLivresEmp++;
    }

        public void desemprunter() {
        nbLivresEmp--;
    }
}